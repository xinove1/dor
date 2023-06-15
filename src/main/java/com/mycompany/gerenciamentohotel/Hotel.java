/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentohotel;

public class Hotel {
    private String nome;
    private String endereco;
    private int numQuartos;
    
    // Construtor
    public Hotel(String nome, String endereco, int numQuartos) {
        this.nome = nome;
        this.endereco = endereco;
        this.numQuartos = numQuartos;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getNumQuartos() {
        return numQuartos;
    }
    
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
}
