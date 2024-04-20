package contas;

public class TestaMetodo {
    public static void main(String[] args) {
		Conta contaDoGustavo = new Conta();
		
		contaDoGustavo.saldo = 100;
		contaDoGustavo.deposita(70);
		System.out.println(contaDoGustavo.saldo);
		
		contaDoGustavo.saca(30);
		System.out.println(contaDoGustavo.saldo);
		System.out.println("---------------------------------------------------------");
		
		contaDoGustavo.saca(200);
		System.out.println("O saldo do Gustavo antes da transferência é: "+ contaDoGustavo.saldo + " reais.");
		
		Conta contaDaAndrea = new Conta();
		contaDaAndrea.deposita(1000);
		
		System.out.println("O saldo da Andréa antes da trasnferência é: "+ contaDaAndrea.saldo+ " reais.");
		System.out.println("---------------------------------------------------------");
		
		contaDaAndrea.transfere(300, contaDoGustavo);
		System.out.println("---------------------------------------------------------");
		System.out.println("O saldo da Andréa depois da transferência é: "+ contaDaAndrea.saldo);
		System.out.println("O saldo do Gustavo depois da transferência é: "+ contaDoGustavo.saldo);
		System.out.println("---------------------------------------------------------");
		
	}
}
