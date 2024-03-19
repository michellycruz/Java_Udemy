import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int CodigoPeca1;
		int CodigoPeca2;
		int QuantidadePeca1;
		int QuantidadePeca2;
		
		double ValorUniPeca1;
		double ValorUniPeca2;
		
		double resultado;
		
		Scanner ler = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("CODIGO PECA 1: ");
		CodigoPeca1 = ler.nextInt();
		System.out.println("QUANTIDADE PECA 1: ");
		QuantidadePeca1 = ler.nextInt();
		System.out.println("VALOR PECA 1: ");
		ValorUniPeca1 = ler.nextDouble();
		System.out.println("CODIGO PECA 2: ");
		CodigoPeca2 = ler.nextInt();
		System.out.println("QUANTIDADE PECA 2:");
		QuantidadePeca2 = ler.nextInt();
		System.out.println("VALOR PECA 2: ");
		ValorUniPeca2 = ler.nextDouble();
		
		resultado = (QuantidadePeca1 * ValorUniPeca1) + (QuantidadePeca2 * ValorUniPeca2);
		
		System.out.printf("VALOR A PAGAR: U$ %.2f%n", resultado);
		
		
	}
}