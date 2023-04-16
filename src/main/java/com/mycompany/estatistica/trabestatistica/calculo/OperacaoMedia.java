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
public class OperacaoMedia implements IOperacao{

    @Override
    public void Calcular(IDado dado) {
        double total = 0;
            for (int i = 0; i < dado.getDados().size(); i++) {
                total += dado.getDados().get(i);
            }
        var resultado = new Resultado("Media",total /dado.getDados().size() );
        resultado.setData(now());
        dado.getResultados().add(resultado);
    }
    
}
