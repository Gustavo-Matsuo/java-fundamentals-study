package variaveis;

public class TestandoCondicionais {

	public static void main(String[] args) {
		System.out.println("Testando condicionais. ");
		int idade = 20;
		int quantidadePessoa = 1;
		boolean acompanhado = quantidadePessoa >= 2;
		
		System.out.println("valor de acompanhado é "+ acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Voê pode comprar uma bebida. ");
		} else {
			System.out.println("Você não pode comprar bebida!");
		}
	}
}