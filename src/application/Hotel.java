package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hospede;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtd;

		System.out.print("Quantos quartos serão alugados? ");
		qtd = sc.nextInt();
		sc.nextLine();

		Hospede[] hospedes = new Hospede[10];

		for (int i = 0; i < qtd; i++) {
			System.out.println("Aluguel [" + i + "]:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto [0 a 9]: ");
			int quarto = sc.nextInt();
			sc.nextLine();

			hospedes[quarto] = new Hospede(nome, email);
		}

		System.out.println("Quartos ocupados:");

		for (int i = 0; i < hospedes.length; i++) {
			if (hospedes[i] != null) {
				System.out.println(i + ": " + hospedes[i].getNome() + ", " + hospedes[i].getEmail());
			}
		}

		sc.close();

	}

}
