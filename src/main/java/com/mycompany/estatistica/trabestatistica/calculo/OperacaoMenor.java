/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.calculo;


import com.mycompany.estatistica.trabestatistica.model.IDado;
import com.mycompany.estatistica.trabestatistica.model.Resultado;
import static java.time.LocalDateTime.now;
import java.util.Collections;

/**
 *
 * @author Mario
 */
public class OperacaoMenor implements IOperacao{

    @Override
    public void Calcular(IDado dado) {
        var resultado = new Resultado("Menor",Collections.min(dado.getDados()));
        resultado.setData(now());resultado.setData(now());
       dado.getResultados().add(resultado);
    }
    
}
