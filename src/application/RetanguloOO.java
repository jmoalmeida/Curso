package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RetanguloOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle x = new Rectangle();

		System.out.print("Informe a base do retangulo: ");
		x.base = sc.nextDouble();
		System.out.print("Informe a altura do retangulo: ");
		x.altura = sc.nextDouble();

		System.out.println("Area: " + x.area());
		System.out.println("Perímetro: " + x.perimetro());
		System.out.println("Diagonal: " + x.diagonal());
		sc.close();

	}

}
