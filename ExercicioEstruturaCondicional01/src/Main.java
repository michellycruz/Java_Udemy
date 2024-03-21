import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner ler = new Scanner(System.in);
		
		a = ler.nextInt();
		b = ler.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("SÃO MULTIPLOS");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
	}
}