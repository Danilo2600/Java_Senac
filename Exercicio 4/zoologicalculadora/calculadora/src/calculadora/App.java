package calculadora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		
		Calculadora calculadora = new Calculadora();
		resultado = resultado = new resultado();
		
		double primeiroNumero, segundoNumero;
		String operacao, escolha;
		
		System.out.println("Digite o primeiro valor:");
		primeiroNumero = teclado.nextDouble();
		
		System.out.println("Digite o Segundo valor:");
		segundoNumero = teclado.nextDouble();
		
	
		
		do {
		System.out.println("Escolha uma das opera��es ( +, -, *, /)");
		operacao = teclado.next();
		
		
	
		
		System.out.println("Deseja realizar outra opera��o[S] [N]");
		escolha = teclado.next();
		}while(escolha.equals("S"));
	}
	
	
			
		public double calcular(double primeiroNumero, double SegundoNumero, String operacao ) {
			Calculadora calculadora = new Calculadora();
			double resultado;
			
			if(operacao.equals ("+")) {
				System.out.println("A soma �: "  + calculadora.somar(primeiroNumero, segundoNumero));
				}
				else if(operacao.equals("-")) {
				System.out.println("A subtra��o � " + calculadora.subtrair(primeiroNumero, segundoNumero) );
					
				}else if(operacao.equals("*")) {
					System.out.println("A multiplica��o �"  + calculadora.multiplicar(primeiroNumero, segundoNumero) );
				}else {
					System.out.println("A divis�o � "  + calculadora.dividir(primeiroNumero, segundoNumero));
				}
			return resultado;
	}
}
	



