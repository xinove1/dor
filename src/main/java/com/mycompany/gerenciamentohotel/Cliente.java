/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentohotel;

public class Cliente {
    private String nome;
    private String telefone;
    private String numIdentificacao;
    
    // Construtor
    public Cliente(String nome, String telefone, String numIdentificacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.numIdentificacao = numIdentificacao;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNumIdentificacao() {
        return numIdentificacao;
    }
    
    public void setNumIdentificacao(String numIdentificacao) {
        this.numIdentificacao = numIdentificacao;
    }
}
