package view;

import java.util.Scanner;
import br.edu.fateczl.pilhaString.PilhaString;
import controller.HistoricoController;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaString historico = new PilhaString();
        HistoricoController controller = new HistoricoController();
        String comando = "";
        
        while (true) {
            System.out.println("Menu:\n");
            System.out.println("1. Inserir novo endereço");
            System.out.println("2. Remover último endereço");
            System.out.println("3. Consultar último endereço");
            System.out.println("4. Sair\n");
            System.out.print("Escolha uma opção: ");
            comando = sc.nextLine();
            
            switch (comando) {
                case "1":
                    System.out.print("Digite o endereço: ");
                    String endereco = sc.nextLine();
                    controller.inserirEndereco(historico, endereco);
                    break;
                case "2":
                    controller.removerEndereco(historico);
                    break;
                case "3":
                    controller.consultarEndereco(historico);
                    break;
                case "4":
                    System.out.println("Programa finalizado");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}