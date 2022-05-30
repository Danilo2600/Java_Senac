package amigo;

public class Participantes {
	private String nome;
	private String presente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPresente() {
		return presente;
	}
	public void setPresente(String presente) {
		this.presente = presente;
	}
	@Override
	public String toString() {
		return " O sorteado foi " + nome + " e o presente " + presente ;
	}

}
