/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.model;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class DadoPeso implements IDado{
    public ArrayList<Double> pesos;
    public static ArrayList<Resultado> resultados = new ArrayList<Resultado>();

    public DadoPeso(ArrayList<Double> pesos) {
        this.pesos = pesos;
    }

    @Override
    public void setDados(ArrayList<Double> dados) {
        this.pesos = dados;
    }

    @Override
    public ArrayList<Double> getDados() {
       return this.pesos;
    }

    @Override
    public void add(Resultado resultado) {
        this.resultados.add(resultado);
    }

    @Override
    public ArrayList<Resultado> getResultados() {
        return this.resultados;
    }
    
}
