package Hotel;

import java.util.Scanner;

public class Hotel {
	public static void main(String[] args)
	{
		double valor = 0;
		int dias;
	

		Scanner teclado = new Scanner(System.in);

		System.out.println("---------HOTEL S�O PATR�CIO---------");
		System.out.println("Quantos dias voc� ira passar no Hote?");
		dias = teclado.nextInt();

		for (int i = 1; i <= dias; i++) {
			valor += (100 / i);
		}

		System.out.print("Valor total � de: " + valor);

		teclado.close();

	}
}


