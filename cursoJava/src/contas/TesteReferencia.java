package contas;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo + " reais.");
		
		Conta segundaConta = new Conta();
		
		System.out.println("O saldo da segunda conta é: " + segundaConta.saldo + " reais.");
		
		segundaConta.saldo += 100;
		System.out.println("O saldo agora da segunda conta é: " + segundaConta.saldo+ " reais.");
		System.out.println("O saldo agora da segunda conta é: " + primeiraConta.saldo+ " reais.");
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma coisa.");
		}else {
				System.out.println("Não são a mesma conta.");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		}

	}


