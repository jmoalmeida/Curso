package curso;

import java.util.Locale;
import java.util.Scanner;

public class Operadores_de_Atribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome completo: ");
		String nome = sc.nextLine();
		System.out.println("Quantos quartos?");
		int quartos = sc.nextInt();
		sc.nextLine();
		System.out.println("Preço do produto:");
		Locale.setDefault(Locale.US);
		double preco = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nome, idade e altura:");
		String nome2 = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		
		
		System.out.println(nome);
		System.out.println(quartos);
		System.out.println(preco);
		System.out.println(nome2);
		System.out.println(idade);
		System.out.println(altura);

		
		sc.close();

	}

}
