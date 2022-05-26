package zoologico;

public class App {

	public static void main(String[] args) {
		Leao L1; 
		L1 = new Leao();
		L1.setCor("Branca");
		L1.setPeso(90);
		L1.setTamnho(100);
		
		Gato G1;
		G1 = new Gato();
		G1.setCor("Branco e Preto");
		G1.setPeso(10);
		G1.setTamnho(15);
		
		Cachorro C1;
		C1 = new Cachorro();
		C1.setCor("Caramelo");
		C1.setPeso(20);
		C1.setTamnho(25);
		
		System.out.println("O Leão pesa " + L1.getPeso() + " ele tem a cor " + L1.getCor() + " tem o tamanho " +  L1.getTamnho() + " e faz " + L1.emitirSom());
		System.out.println("O Gato pesa " + G1.getPeso() + " ele tem a cor " + G1.getCor() + " tem o tamanho " +  G1.getTamnho() + " e faz " + G1.emitirSom() + " " +G1.Brincar());
		System.out.println("O Cachorro pesa " + C1.getPeso() + " ele tem a cor " + C1.getCor() + " tem o tamanho " +  C1.getTamnho() + " e faz " + C1.emitirSom() + " " + C1.Brincar() );
	}

}
