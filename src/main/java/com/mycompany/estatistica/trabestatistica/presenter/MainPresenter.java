/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.presenter;

import com.mycompany.estatistica.trabestatistica.loader.LeitorCsv;
import com.mycompany.estatistica.trabestatistica.model.DadoPeso;
import com.mycompany.estatistica.trabestatistica.model.IDado;
import com.mycompany.estatistica.trabestatistica.service.CalculadoraEstatisticaService;
import com.mycompany.estatistica.trabestatistica.view.MainView;
import com.mycompany.estatistica.trabestatistica.view.VisualizarResultadoView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class MainPresenter {
    private MainView view;
    private CalculadoraEstatisticaService calcula = new CalculadoraEstatisticaService();
    
    
     public MainPresenter() throws IOException {
        init();
    }
     
     public void init() {
        
        view = new MainView();
        view.setVisible(true);
        
        view.getCalcular().addActionListener((e) -> {
             if( view.getDado() !=null){
             calcula.processar(view.getDado());
             new VisualizarResultadoView(view.getDado()).setVisible(true);
             }
        }); 
        view.getVisualizar().addActionListener((e) -> {
             if( view.getDado() !=null && view.getDado().getResultados()!=null){
                new VisualizarResultadoView(view.getDado()).setVisible(true);
             }
        }); 

        
        view.pack();
        
    }
}
