/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.service;

import com.mycompany.estatistica.trabestatistica.calculo.IOperacao;
import com.mycompany.estatistica.trabestatistica.calculo.OperacaoDesvioPadrao;
import com.mycompany.estatistica.trabestatistica.calculo.OperacaoMaior;
import com.mycompany.estatistica.trabestatistica.calculo.OperacaoMedia;
import com.mycompany.estatistica.trabestatistica.calculo.OperacaoMenor;
import com.mycompany.estatistica.trabestatistica.calculo.OperacaoSomatorio;
import com.mycompany.estatistica.trabestatistica.calculo.OperacaoVariancia;
import com.mycompany.estatistica.trabestatistica.model.IDado;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class CalculadoraEstatisticaService {
    
    private ArrayList<IOperacao> metodos = null ;

    public CalculadoraEstatisticaService() {
         metodos = new ArrayList<>();
         this.metodos.add(new OperacaoDesvioPadrao());
         this.metodos.add(new OperacaoMaior());
         this.metodos.add(new OperacaoMedia());
         this.metodos.add(new OperacaoMenor());
         this.metodos.add(new OperacaoSomatorio());
         this.metodos.add(new OperacaoVariancia());
        
    }
    
    
    public void processar(IDado dado){
        for(IOperacao op : metodos){
            op.Calcular(dado);
        }
    }
}
