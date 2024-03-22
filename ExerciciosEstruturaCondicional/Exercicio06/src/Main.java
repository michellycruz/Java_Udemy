//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double numero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um número de 0 a 100");
		
		numero = ler.nextDouble();
		
		if(numero >= 0.00 && numero <= 25.00) {
			System.out.println("O número informado está entre 0 e 25");
		} else if(numero >= 25.01 && numero <= 50.00) {
			System.out.println("O número informado está entre 25 e 50");
		} else if(numero >= 50.01 && numero <= 75.00) {
			System.out.println("O número informado está entre 50 e 75");
		}else if(numero >= 75.01 && numero <= 100.00) {
			System.out.println("O número informado está entre 75 e 100");
		} else {
			System.out.println("Número fora de intervalo");
		}
	}
}