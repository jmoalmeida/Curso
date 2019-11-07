package curso;

import java.util.Scanner;

public class Estruturas_Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int i = sc.nextInt();
		if (i < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}

		sc.close();

	}

}
