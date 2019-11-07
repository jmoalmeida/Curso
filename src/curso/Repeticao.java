package curso;

import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número:");
		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			System.out.print("Digite o numero: ");
			x = sc.nextInt();

		}
		
		System.out.println("a soma é " + soma);

		sc.close();
	}

}
