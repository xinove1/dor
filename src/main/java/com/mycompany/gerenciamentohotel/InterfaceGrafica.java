package com.mycompany.gerenciamentohotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InterfaceGrafica extends JFrame {
    private JTextArea textArea;
    private JButton lerCSV;
    private JButton lerTXT;
    private JButton adicionarCliente;
    private JButton adicionarQuarto;
    private JButton fazerReserva;

    private List<Cliente> clientes;
    private List<Reserva> reservas; // Nao precisa
    private List<Quarto> quartos;

    public InterfaceGrafica() {
        clientes = new ArrayList<>();
        quartos = new ArrayList<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        this.lerCSV = new JButton("Ler CSV");
        this.lerTXT = new JButton("Ler TXT");
        this.adicionarCliente = new JButton("Adicionar Cliente");
        this.adicionarQuarto = new JButton("Adicionar Quarto");
        this.fazerReserva = new JButton("Fazer Reserva");

        add(lerCSV);
        add(lerTXT);
        add(adicionarCliente);
        add(adicionarQuarto);
        add(fazerReserva);
        setVisible(true);
    }


}