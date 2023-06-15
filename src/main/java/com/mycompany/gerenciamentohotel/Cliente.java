/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private List<Reserva> reservas;
    
    // Construtor
    public Cliente(String nome, String telefone, String numIdentificacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.numIdentificacao = numIdentificacao;
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
