package Principal;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========");
		System.out.println("PARTE 1");
		System.out.printf("Quantos números serão digitados?");
		int n = sc.nextInt();
		System.out.println("");
		int[] numerosNegativos = new int[n];
		int[] numerosPositivos = new int[n];
		for(int i=0; i < n; i++) {
			System.out.printf("\nDigite o %d número: ", i+1);
			int numero = sc.nextInt();
			if (numero < 0) {
				numerosNegativos[i] = numero;
			}
			else {
				numerosPositivos[i] = numero;
			}
		}
		System.out.printf("\nNúmeros negativos digitados: ");
		for (int i = 0; i < numerosNegativos.length; i++) {
			if(numerosNegativos[i] != 0) {
				System.out.println(numerosNegativos[i]);
			}
		}
		System.out.printf("\nNúmeros positivos digitados: ");
		for (int i = 0; i < numerosPositivos.length; i++) {
			if(numerosPositivos[i] != 0) {
				System.out.println(numerosPositivos[i]);			}
		}
		System.out.println("==========");
		sc.close();
	}
}
