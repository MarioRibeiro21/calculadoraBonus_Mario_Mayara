/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.loader;

import com.mycompany.estatistica.trabestatistica.model.DadoPeso;
import com.mycompany.estatistica.trabestatistica.model.IDado;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class LeitorCsv {
     private Scanner input;
    private final DadoPeso dado = new DadoPeso( new ArrayList<Double>());
    
    
    
    public IDado lerArquivo(String file){
        
        try {
            
            input = new Scanner(Paths.get(file));            
            input.nextLine();
            
            while(input.hasNext()) {
                String[] data = input.nextLine().split(";");
                Double valor = Double.valueOf(data[0]);
                dado.getDados().add(valor);
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo" + e.getMessage());
        }
        
        return dado;
    }
}
