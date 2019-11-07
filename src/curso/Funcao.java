package curso;

import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro n�mero: ");
		int a = sc.nextInt();
		System.out.println("Segundo n�mero: ");
		int b = sc.nextInt();
		System.out.println("Terceiro n�mero: ");
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		
		showResult(maior);
		
		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x>y && x>z) {
			aux = x;
		}
		else if (y>z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
		
	}
	
	public static void showResult(int valor) {
		System.out.println("Maior valor � " + valor);
	}

}
