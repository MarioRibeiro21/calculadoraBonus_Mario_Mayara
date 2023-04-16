/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.calculo;

import com.mycompany.estatistica.trabestatistica.model.IDado;
import com.mycompany.estatistica.trabestatistica.model.Resultado;
import static java.time.LocalDateTime.now;



/**
 *
 * @author Mario
 */
public class OperacaoVariancia implements IOperacao{

    @Override
    public void Calcular(IDado dado) {
        double p1 = 1 / Double.valueOf(dado.getDados().size() - 1);
        double somaAoQuadrado = 0;
        double soma = 0;
        
        for (int counter = 0; counter < dado.getDados().size() ; counter++) {
            somaAoQuadrado += Math.pow(dado.getDados().get(counter), 2);
        }
          
        for (int counter = 0; counter < dado.getDados().size() ; counter++) {
            soma += dado.getDados().get(counter);
        }
        
        double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(dado.getDados().size() ));
        
        var resultado = new Resultado("Variância",p1 * p2);
        resultado.setData(now());
        dado.getResultados().add(resultado);
    }
    
}
