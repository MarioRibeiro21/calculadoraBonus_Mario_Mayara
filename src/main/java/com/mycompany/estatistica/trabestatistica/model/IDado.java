/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.model;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public interface IDado {
    public void setDados(ArrayList<Double> dados);
    public ArrayList<Double> getDados();
    public void add(Resultado resultado );
    public ArrayList<Resultado> getResultados();
    
}
