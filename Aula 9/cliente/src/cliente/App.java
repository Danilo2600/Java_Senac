package cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	
		public static void main(String[] args) {
			int opcao;
			Cliente cliente;
			String nome, telefone;
			int idade, estrela;

			// Criação do array list
			List<Cliente> banco = new ArrayList<Cliente>();
			App app = new App();

			Scanner teclado = new Scanner(System.in);

			// inicio do loop
			do {
				System.out.println("-------Menu------");
				System.out.println("1 - Ler Cliente");
				System.out.println("2 - Listar Clientes");
				System.out.println("3 - Media das idades");
				System.out.println("4 - Alterar cliente");
				System.out.println("5 - Excluir cliente");
				System.out.println("6 - ver a nota do cliente");
				System.out.println(" 7 - fim");
				
				System.out.println("-----------------");
				System.out.println("Digite uma opção:");

				opcao = teclado.nextInt();

				// incluindo o cliente
				if (opcao == 1) {
					cliente = new Cliente();

					System.out.println("------------------");
					System.out.println("informe o nome do cliente");
					// colocando o nome cliente direto na class Cliente
					// cliente.setNome(teclado.nextLine());
					nome = teclado.next();

					System.out.println("Informe o telefone ");
					telefone = teclado.next();

					System.out.println("Qual a idade do cliente");
					idade = teclado.nextInt();

					System.out.println("Avaliar cliente de 1 a 5");
					estrela = teclado.nextInt();
					
					cliente.setNome(nome);
					cliente.setIdade(idade);
					cliente.setTelefone(telefone);
					cliente.setEstrela(estrela);
					

					// Adicionando o cliente no banco de dados
					banco.add(cliente);

					// Listar Clientes
				} else if (opcao == 2)
					for (Cliente c : banco) {
						System.out.println(c.getNome() + " - " + c.getTelefone() + " - " + c.getIdade() + " - "  + c.getEstrela() );
						// Calcular Media das idades
					}
				else if (opcao == 3) {
					System.out.println("A media das idades e: " + app.calcularMedia(banco));
				} else if (opcao == 4) {
					int alterar;
					
					System.out.println("Qual indice você gostaria de alterar?");
					alterar = teclado.nextInt();
					Cliente alteraCliente = banco.get(alterar);
					
					
					System.out.println("Digite o nome do cliente");
					nome = teclado.next();
					System.out.println("Digite o telefone");
					telefone = teclado.next();
					System.out.println("Digite a idade");
					idade = teclado.nextInt();
					
					alteraCliente.setNome(nome);
					alteraCliente.setTelefone(telefone);
					alteraCliente.setIdade(idade);
					
				} else if (opcao == 5) {
					
					System.out.println("Qual  desejar deletar");
				banco.remove(teclado.nextInt());

				
				}else if (opcao == 6) {
					int nota;
					System.out.println("Digite o indice do cliente que gostaria de ver a nota");
					nota = teclado.nextInt();   
				
			
				}

			} while (opcao < 7);
			teclado.close();

		}

		public double calcularMedia(List<Cliente> lista) {
			int somaIdade = 0;
			for (Cliente c : lista) {
				// somaIdade = somaIdade + c.getIdade();
				somaIdade += c.getIdade();
			}

			return (somaIdade / lista.size());
		}

	}


