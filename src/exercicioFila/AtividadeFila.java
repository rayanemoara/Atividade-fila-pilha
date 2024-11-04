package exercicioFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		Scanner banco = new Scanner(System.in);
		
		int opcao;
		
		// Entrada do Menu de opções numa fila de atendimento bancário
        do {
            System.out.println("\n————————————MENU:—————————————");
            System.out.println("——————————————————————————————");
            System.out.println("1.| Adicionar cliente a fila |");
            System.out.println("2.| Listar clientes          |");
            System.out.println("3.| Retirar cliente da fila  |");
            System.out.println("0.| Sair                     |");
            System.out.println("——————————————————————————————");
            System.out.print("\nDigite a opção desejada: ");
            opcao = banco.nextInt();
            
            switch (opcao) {
            case 1:
            	System.out.println("\nDigite o nome do cliente: ");
            	String nome = banco.next();
                fila.add(nome);
   // Saída dos dados   
                System.out.println("\nCliente " + nome + " adicionado(a) à fila.");
                break;
                
            case 2:
                if (fila.isEmpty()) {
                    System.out.println("\nA fila está vazia.");
                } else {
                    System.out.println("\nClientes na fila: ");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                }
                break;
            
            case 3:
                if (fila.isEmpty()) {
                    System.out.println("\nA fila está vazia.");
                } else {
                    String clienteChamado = fila.poll();
                    System.out.println("\nCliente " + clienteChamado + " chamado(a).");
                }
                break;
                
            case 0:
                System.out.println("\nSistema encerrado.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
            
    } while (opcao != 0);


    banco.close();
}
	
}