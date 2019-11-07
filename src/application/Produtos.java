package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produtos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product produto = new Product();

		System.out.println("Entre com os dados do produto");
		System.out.print("Nome:");
		produto.name = sc.nextLine();
		System.out.print("Preço:");
		produto.price = sc.nextDouble();
		System.out.print("Quantidade em estoque:");
		produto.quantity = sc.nextInt();
		System.out.println("Total: " + produto.totalValueInStock());
		
		System.out.println("Dados do produto: " + produto.toString());
		
		System.out.print("Produtos a serem adicionados ao estoque: ");
		produto.addProducts(sc.nextInt());
		
		System.out.println("Dados atualizados do produto: " + produto.toString());

		System.out.print("Produtos a serem removidos do estoque: ");
		produto.removeProducts(sc.nextInt());
		
		System.out.println("Dados atualizados do produto: " + produto.toString());


		sc.close();

	}
	

}
