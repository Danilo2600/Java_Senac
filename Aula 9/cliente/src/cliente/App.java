package cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcao;
		Cliente cliente;
		String nome, telefone,excluir ;
		int idade;
		
		App app = new App();
		
		//Crianção do array list
		List<Cliente> banco = new ArrayList<Cliente>();
		
		
		Scanner teclado = new Scanner(System.in);
		
		// inicio do loop
		do{
		System.out.println("-------Menu------");
		System.out.println("1 - Ler Cliente");
		System.out.println("2 -Listar Clientes:");
		System.out.println("3 - Média de idade dos clientes:");
		System.out.println("4 - Alterar cliente:");
		System.out.println("5 - Exluir clientes:");
		
		System.out.println("6 FIM");
		System.out.println("-----------------");
		System.out.println("Digite uma opção:");
		
		
		
		opcao = teclado.nextInt();
		
		//incluindo o cliente
		if (opcao == 1) {
			cliente = new Cliente();
			
			System.out.println("------------------");
			System.out.println("informe o nome do cliente");
			// colocando o nome cliente direto na class Cliente
			//cliente.setNome(teclado.nextLine());
			nome = teclado.next();
			
			System.out.println("Informe o telefone ");
			telefone = teclado.next();
			
			System.out.println("Qual a idade do cliente");
			idade = teclado.nextInt();
			
			cliente.setNome(nome);
			cliente.setIdade(idade);
			cliente.setTelefone(telefone);
			//Dicionado o cliente no banco de dados
			
			banco.add(cliente);
		}else if (opcao == 2) {
			for (Cliente c: banco) {
				System.out.println(c.getNome());
			}
		}else if(opcao == 3) {
				System.out.println("A media da idade " + app.calularMedia(banco));
			}
		
		
		
			
			
		
	
			
		}while(opcao < 6);
		teclado.close();
		
		

	}
	//calculo do cliente
		public double calularMedia(List<Cliente> lista)  {
			int somaIdade = 0;
		
			for(Cliente c: lista){
				somaIdade += c.getIdade();
			}
			return(somaIdade / lista.size());
			
		}
		
		}

