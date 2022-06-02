
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Teste conta bancaria");
			ContaBanco ContaSimples = new ContaBanco();
			
		ContaSimples.setNomeCliente("Danilo");
		ContaSimples.setNumConta("1235");
		ContaSimples.depositar(1000);
		
		 if (ContaSimples.sacar(900)) {
			 System.out.println("Saque efetuado com sucesso, novo saldo =" + ContaSimples.getSaldo());
		 } else {
			 System.out.println("Saque não autorizado valor insuficiente");
		 }
		 
		System.out.println(ContaSimples);
	}

}
