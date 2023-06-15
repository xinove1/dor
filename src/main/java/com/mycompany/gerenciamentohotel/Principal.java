import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal implements HumanoComputador {
    private List<Reserva> reservas;
    
    public Principal() {
        reservas = new ArrayList<>();
    }
    
    @Override
    public void exibirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Fazer reserva");
        System.out.println("2. Listar reservas");
        System.out.println("3. Cancelar reserva");
        System.out.println("4. Sair");
        System.out.println("----------------\n");
    }
    
    @Override
    public void lerOpcao() {
        int opcao = 0;
        
        while (opcao != 4) {
            exibirMenu();
            
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    fazerReserva();
                    break;
                case 2:
                    listarReservas();
                    break;
                case 3:
                    cancelarReserva();
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                    break;
            }
        }
    }
    
    private void fazerReserva() {
        // Implementação da lógica para fazer uma reserva
        // (incluindo leitura de dados do usuário, validações, criação de objetos, etc.)
    }
    
    private void listarReservas() {
        // Implementação da lógica para listar as reservas existentes
        // (percorrer a lista de reservas e exibir os detalhes de cada reserva)
    }
    
    private void cancelarReserva() {
        // Implementação da lógica para cancelar uma reserva
        // (incluindo busca da reserva, remoção da lista de reservas, etc.)
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.lerOpcao();
    }
}