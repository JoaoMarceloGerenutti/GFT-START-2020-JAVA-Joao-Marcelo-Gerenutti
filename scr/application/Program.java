package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor inicial: ");
		int valorInicial = sc.nextInt();
		
		System.out.print("Digite o valor final: ");
		int valorFinal = sc.nextInt();
		
		System.out.println("SAIDA");
		System.out.println("------------------------");
		for (int i = valorInicial; i <= valorFinal; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
