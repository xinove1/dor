package com.mycompany.gerenciamentohotel;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Reserva> reservas;
    
    // Construtor
    public Cliente(String nome, String telefone, String numIdentificacao) {
        super(nome, telefone, numIdentificacao);
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public int quantidadeDeReservas() {
        int count = 0;
        for (Reserva reserva: reservas) {
            count++;
        }
        return count;
    }
}
