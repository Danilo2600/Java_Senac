package canil;

public class Cachorro {
	String cor;
	int tamanho;
	
void emitirSom() {
	if(tamanho>60) {
		System.out.println("Woof! Woolf!");
	}else if (tamanho>14){
		System.out.println("Ruff! Ruff");
	}else {
		System.out.println("yip! yip");
	}
}
public void setCor(String cor) {
	this.cor = cor;
}
public String retornarCor() {
	return cor;

}
}

	
