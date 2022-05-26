package canil;

public class ChachorroTeste {

	public static void main(String[] args) {
		Cachorro um = new Cachorro();
		um.tamanho = 70;
		um.emitirSom();
		um.setCor("Branco");
		
		
		Cachorro dois = new Cachorro();
		dois.tamanho = 8;
		dois.emitirSom();
		dois.setCor("Caramelo");
		
		Cachorro tres = new Cachorro();
		tres.tamanho =35;
		tres.emitirSom();
		tres.setCor("Preto");
		
		
		System.out.println("O cahorro um é " + um.retornarCor());
		System.out.println("O cahorro um é " + dois.retornarCor());
		

	}

}
