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
public class OperacaoSomatorio implements IOperacao{

    @Override
    public void Calcular(IDado dado) {
        double soma = 0;
            for (int counter = 0; counter < dado.getDados().size(); counter++) {
                soma += dado.getDados().get(counter);
            }
        var resultado = new Resultado("Somatorio",soma);
        resultado.setData(now());
        dado.getResultados().add(resultado) ;
    }
    
}
