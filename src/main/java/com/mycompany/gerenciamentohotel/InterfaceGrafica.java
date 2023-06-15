import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InterfaceGrafica extends JFrame {
    private JTextArea textArea;
    private JButton letCSV;
    private JButton lerTXT;
    private JButton adicionarCliente;
    private JButton adicionarQuarto;
    private JButton fazerReserva;

    private List<Cliente> clientes;
    private List<Reserva> reservas; // Nao precisa
    private List<quarto> quartos;

    public InterfaceGrafica() {
        clientes = new ArrayList<>();
        quartos = new ArrayList<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}