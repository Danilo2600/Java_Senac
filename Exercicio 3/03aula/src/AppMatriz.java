
public class AppMatriz {

	public static void main(String[] args) {

		//Cria o Array filhote de tamanho 3
		Cachorro[] filhote = new Cachorro[3];
		
		//Criando os cachorros para colocar no array cahorro p1 cachorro p2
		Cachorro p1 = new Cachorro();
		Cachorro p2 = new Cachorro();
		
		
		//Coloca o nome do cachorro que esta no array
		p2.setNome ("Carlos");
		p1.setNome ("gustavo");
		
		//Coloca o cachorro dentro dos arrays filhotes
		filhote[0] = p1; 
		filhote[1] = p2;
		filhote[2] = new Cachorro();
		filhote[2].setNome("Pedro");
		
		//imprimido os arrays
		System.out.println(filhote[1].getNome());
		System.out.println(filhote[0].getNome());
		System.out.println(filhote[2].getNome());
		
		//Ler tudo que está dentro do array filhotes
		for(Cachorro exemplo: filhote) {
			System.out.println("O cahorro tem o nome:" + exemplo.getNome());
			
		}
	}

}
