//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 

//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int inicioJogo;
		int finalJogo;
		int duracao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a hora que o jogo começou: ");
		inicioJogo = ler.nextInt();
		System.out.println("Informe a hora que o jogo terminou: ");
		finalJogo = ler.nextInt();
		
		if (inicioJogo < finalJogo) {
			duracao = finalJogo - inicioJogo;
		} else {
			duracao = 24 - inicioJogo + finalJogo;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		ler.close();
		
	}
}