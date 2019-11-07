package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class CadFunci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int qtd = sc.nextInt();
		
		sc.nextLine();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Emplyoee #"+i+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			
			sc.nextLine();
			
			list.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idFunci = sc.nextInt();
		
		Funcionario fun = list.stream().filter(x -> x.getId() == idFunci).findFirst().orElse(null);

		if (fun == null) {
			System.out.println("This id does not exist!");
		}

		else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			fun.aumentaSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("List of employees:");

		for (Funcionario obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
