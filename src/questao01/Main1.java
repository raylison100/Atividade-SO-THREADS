package questao01;

import java.util.Scanner;

public class Main1 {

	private static Scanner ler;

	public static void main(String[] args) {

		ler = new Scanner(System.in);
		int n;
		int continuar;

		while (true) {

			System.out.printf("INFORME O NUMERO A SER VALIDADO: ");
			n = ler.nextInt();

			PrimoBruto bruto = new PrimoBruto(n);

			if (bruto.validaPrimo()) {

				System.out.println("\nO numero " + n + " é primo.");

			} else {
				System.out.println("\nO numero " + n + " não é primo.");
			}

			System.out.println("\n---------------------------------------------------------------------------\n");

			System.out.println("Deseja testar novo valor? 1 sim 2 não: ");
			continuar = ler.nextInt();

			if (continuar == 2)
				break;

			System.out.println("\n");
		}
	}

}
