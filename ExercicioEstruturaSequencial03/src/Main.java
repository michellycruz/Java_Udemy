import java.util.Locale;
import java.util.Scanner;

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