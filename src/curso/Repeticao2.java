package curso;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas repetições?");
		int qtd = sc.nextInt();

		int i;
		int soma = 0;

		for (i = 0; i < qtd; i++) {

			System.out.println("Digite o numero " + i + ":");
			int x = sc.nextInt();
			soma += x;

		}
		System.out.println("A soma é " + soma);

		sc.close();

	}

}
