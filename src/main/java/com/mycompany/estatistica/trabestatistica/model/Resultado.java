/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatistica.trabestatistica.model;

import java.time.LocalDateTime;

/**
 *
 * @author Mario
 */
public class Resultado {
    private String nomeOperacao;
    private Double valor;
    private LocalDateTime data;

    public Resultado(String nomeOperacao, Double valor) {
        this.nomeOperacao = nomeOperacao;
        this.valor = valor;
    }

    public String getNomeOperacao() {
        return nomeOperacao;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setNomeOperacao(String nomeOperacao) {
        this.nomeOperacao = nomeOperacao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
    
    
    
}
