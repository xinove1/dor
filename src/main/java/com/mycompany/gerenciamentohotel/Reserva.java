/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentohotel;

import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Date dataCheckIn;
    private Date dataCheckOut;
    private Quarto quarto;
    
    // Construtor
    public Reserva(Cliente cliente, Date dataCheckIn, Date dataCheckOut, Quarto quarto) {
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.quarto = quarto;
    }
    
    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Date getDataCheckIn() {
        return dataCheckIn;
    }
    
    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }
    
    public Date getDataCheckOut() {
        return dataCheckOut;
    }
    
    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
    
    public Quarto getQuarto() {
        return quarto;
    }
    
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
}
