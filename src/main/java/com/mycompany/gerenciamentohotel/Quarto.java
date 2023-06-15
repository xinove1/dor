/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentohotel;

public class Quarto {
    private int numeroQuarto;
    private String tipoQuarto;
    private double precoPorNoite;
    
    // Construtor
    public Quarto(int numeroQuarto, String tipoQuarto, double precoPorNoite) {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.precoPorNoite = precoPorNoite;
    }
    
    // Getters e Setters
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    
    public String getTipoQuarto() {
        return tipoQuarto;
    }
    
    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
    
    public double getPrecoPorNoite() {
        return precoPorNoite;
    }
    
    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }
}
