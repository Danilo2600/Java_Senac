package canil;

public class Cachorro {
private	String cor;
int tamanho;
private String nome;
	
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
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	
}
}

	
