package exercicioPilha;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		Stack<String> pilhaLivro = new Stack<String>();
		Scanner biblioteca = new Scanner(System.in);
				
				int opcao;

				// Entrada de dados Menu de opções
		        do {
		            System.out.println("\n————————————MENU:—————————————");
		            System.out.println("——————————————————————————————");
		            System.out.println("1.| Adicionar livro desejado |");
		            System.out.println("2.| Listar todos os livros   |");
		            System.out.println("3.| Retirar livro da pilha   |");
		            System.out.println("0.| Sair                     |");
		            System.out.println("——————————————————————————————");

		            System.out.println("\nDigite a opção desejada: ");
		            opcao = biblioteca.nextInt();
		            
		            switch (opcao) {
		            
		            case 1:
		            System.out.println("\nDigite o nome do livro: ");
		      
		            // Saída de dados com livro adicionado
		            
		            biblioteca.skip("\\R?");
					pilhaLivro.add(biblioteca.nextLine());
		            System.out.println("\nLivro adicionado com sucesso!");
		            
		            break;
		 
		            // if else para caso a pilha de livros estiver vazia
		            
		            case 2:
		            if (pilhaLivro.isEmpty()) {
		                System.out.println("\nA pilha de livros está vazia.");
		            } else {
		                System.out.println("\nLivros na pilha: ");
		                for (String livro : pilhaLivro) {
		                    System.out.println(livro);
		                }
		            }
		            
		            break;
		            
		            case 3:
		            if (pilhaLivro.isEmpty())
		            {
		                System.out.println("\nA pilha de livros está vazia.");
		            } else {
		                String livroRemovido = pilhaLivro.pop();
		                System.out.println("\nLivro removido: " + livroRemovido);
		            }
		            
		            break;
		            
		            case 0:
		            System.out.println("\nSistema encerrado.");
		            
		            break;
		            
		            default:
		            System.out.println("\nOpção inválida.");
		            
		            }
		            
		        } while (opcao != 0);

				biblioteca.close();
				
	}

}
