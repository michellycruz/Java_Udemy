//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
//situação.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double x;
		double y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Valor X:");
		x = ler.nextDouble();
		System.out.println("Valor Y:");
		y = ler.nextDouble();
		
		if(y > 0 && x > 0) {
			System.out.println("QUADRANTE 1");
		} else if (y > 0 && x < 0) {
			System.out.println("QUADRANTE 2");
		} else if (y < 0 && x < 0) {
			System.out.println("QUADRANTE 3");
		} else if (y < 0 && x > 0){
			System.out.println("QUADRANTE 4");
		} else {
			System.out.println("ORIGEM");
		}
	}
}