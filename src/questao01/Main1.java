package questao01;

import java.util.Scanner;

public class Main1 {

	private static Scanner ler;

	public static void main(String[] args) throws InterruptedException {

//		ler = new Scanner(System.in);
//		long n;
//		int continuar;
//
//		while (true) {
//
//			System.out.printf("INFORME O NUMERO A SER VALIDADO: ");
//			n = ler.nextLong();
//
//			PrimoBruto bruto = new PrimoBruto(n);
//
//			if (bruto.validaPrimo()) {
//
//				System.out.println("\nO numero " + n + " é primo.");
//
//			} else {
//				System.out.println("\nO numero " + n + " não é primo.");
//			}
//			
//			System.out.println("\nTempo de execursão: " + bruto.getTime());
//
//			System.out.println("\n---------------------------------------------------------------------------\n");
//
//			System.out.println("Deseja testar novo valor? 1 sim 2 não: ");
//			continuar = ler.nextInt();
//
//			if (continuar == 2)
//				break;
//
//			System.out.println("\n");
//
//		}

		// THREAD

		ler = new Scanner(System.in);
		long n;
		int x;
		int continuar;

		while (true) {

			Boolean ePrimo = true;

			System.out.printf("INFORME O NUMERO A SER VALIDADO: ");
			n = ler.nextLong();

			System.out.printf("INFORME O NUMERO DE THREADS A SER ULTILIZADO: ");
			x = ler.nextInt();

			PrimoThread bruto[] = new PrimoThread[x];
			
			long inicio;
			long fim;

			for (int i = 0; i < x; i++) {

//				bruto[i] = new PrimoThread(i);+

			}
			
			for (int i = 0; i < x; i++)
				bruto[i].start();
			for (int i = 0; i < x; i++)
				bruto[i].join();
			
			System.out.println("Acabou");

			for (int i = 0; i < x; i++) {

				if (!bruto[i].validaPrimo()) {
					System.out.println("\nO numero " + n + " é primo.");
					break;
				}
			}

			if (ePrimo) {

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
