package variaveis;

public class TestandoVariaveis {

	public static void main(String[] args) {
		System.out.println("Testando condicionais. ");
		int idade = 12;
		int quantidadePessoa = 2;
		if (idade >= 18) {
			System.out.println("Ok, você tem mais de 18 anos. ");
			System.out.println("Você pode comprar uma bebida. ");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("Ok, você é menor de idade mais pode" + " comprar, pois está acompanhdo");

			}
			System.out.println("Você tem menos de 18 anos");
			System.out.println("E não está acompanhado!");
		}
	}

}
