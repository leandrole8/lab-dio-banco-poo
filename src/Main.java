
public class Main {

	public static void main(String[] args) {
		Cliente leandro = new Cliente();
		leandro.setNome("Leandro");
		leandro.setCpf("123.456.789-12");
		
		Conta cc = new ContaCorrente(leandro);
		Conta poupanca = new ContaPoupanca(leandro);

		cc.depositar(250);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}