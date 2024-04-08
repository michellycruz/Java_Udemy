package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Informe a largura e altura do retângulo");
		rect.width = ler.nextDouble();
		rect.height = ler.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		ler.close();
	}
}