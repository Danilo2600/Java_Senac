package amigo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoOculto {

	public static void main(String[] args) {
		int numeroParticipantes;
		String nome, continua, presente, aniversario;
		Participantes participantes;
		
		
		Scanner teclado = new Scanner(System.in);
		
		List<Participantes> nomes = new ArrayList<Participantes>();
		Random posicao = new Random();
		
		System.out.println("Quantas pessoas no sorteio ?");
		numeroParticipantes = teclado.nextInt();
		
		for(int i = 0; i < numeroParticipantes; i++) {
			participantes = new Participantes();
			
		System.out.println("Digite o nome do participante" +(i+ 1));
		nome = teclado.next();
			
		System.out.println(" Digite o presente");
		presente = teclado.next();
		
		System.out.println("Qual é a data do aniversario");
		aniversario = teclado.next();
		
		participantes.setNome(nome);
		participantes.setPresente(presente);
	   
		
		
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			participantes.setAniversario(formato.parse(aniversario));
			nomes.add(participantes);
		}
		
		System.out.println("Deseja fazer o sorteio agora? S/N");
		continua = teclado.next();
		
		if (continua.equals("S")) {
			/*
			System.out.println("O nome sorteado e " + nomes.get(posicao.nextInt(nomes.size())).getNome() + " presente  " +
													nomes.get(posicao.nextInt(nomes.size())).getPresente());
		*/
			
		System.out.println(nomes.get(posicao.nextInt(nomes.size())));	
			
		} else {
			System.out.println("O sorteio foi cancelado");
		}
		
	}

}
