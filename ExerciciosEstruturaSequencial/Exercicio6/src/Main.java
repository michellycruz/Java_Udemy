import java.util.Locale;
import java.util.Scanner;
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
//a) a área do triângulo retângulo que tem A por base e C por altura. 
//b) a área do círculo de raio C. (pi = 3.14159) 
//c) a área do trapézio que tem A e B por bases e C por altura. 
//d) a área do quadrado que tem lado B. 
//e) a área do retângulo que tem lados A e B

public class Main {
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double triangulo;
		double circulo;
		double trapezio;
		double quadrado;
		double retangulo;
		
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		triangulo = (a * c)/2;
		circulo = 3.14159 * Math.pow(c, 2);
		trapezio = ((a + b) * c)/2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
		
		System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETÂNGULO: %.3f%n", retangulo);
	}
}