//escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int codigo;
		double total = 0.00;
		double quantidade;
		
		System.out.println("Escolha o que quer comprar: ");
		System.out.println("1 - Cachorro Quente: R$4.00 \n2 - X Salada: R$4.50 \n3 - X Bacon: R$5.00"
				+ " \n4 - Torrada simples: R$2.00 \n5 - Refrigerante: R$1.50");
		
		Scanner ler = new Scanner(System.in);
		
		codigo = ler.nextInt();
		
		System.out.println("Informe a quantidade: ");
		
		quantidade = ler.nextDouble();
		
		if(codigo == 1) {
			total = 4.00 * quantidade;
		} else if(codigo == 2) {
			total = 4.50 * quantidade;
		} else if(codigo == 3) {
			total = 5.00 * quantidade;
		} else if(codigo == 4) {
			total = 2.00 * quantidade;
		} else if(codigo == 5) {
			total = 1.50 * quantidade;
		} else {
			System.out.println("Comando inválido");
		}

		System.out.printf("TOTAL: R$ %.2f%n", total);
	}
}