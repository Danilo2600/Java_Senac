import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Loja {

	public static void main(String[] args) {
		String nome, telefone;
		int idade, resp;
		int numero1 = 1;
		int numero2 = 2;
		int numero3 = 3;
		
		
		System.out.println("1 - ler cliente");
		System.out.println("2 - Lista de cliente");
		System.out.println("3 - Fim");
		List<String> Cliente = new ArrayList<String>();

		Scanner teclado = new Scanner(System.in);
		resp = teclado.nextInt();
		if(resp ==1) {
			 System.out.println("Digite o nome do Cliente");
			 nome = teclado.next();
			 
			 Clientes.add(nome)
			 
	
		
	
}
}