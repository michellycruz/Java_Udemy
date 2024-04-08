package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Nome: ");
		func.name = ler.next();
		System.out.println("Gross Salary: ");
		func.grossSalary = ler.nextDouble();
		System.out.println("Tax: ");
		func.tax = ler.nextDouble();
		
		System.out.printf("Employee: " + func.name + ", $ %.2f%n", func.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = ler.nextDouble();
		func.increaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Updated data: " + func);
		
	}
}