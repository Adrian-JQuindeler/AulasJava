package Principal;

import java.util.Scanner;

public class Para{

	public static void main(String[] args) {
		
		Scanner beta = new Scanner(System.in);
		System.out.printf("Quantos valores quer digitar?");
		int n = beta.nextInt();
		
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite o %d valor:",i+1);
			int x = beta.nextInt();
			soma += x;}
		System.out.printf("A soma dos valores é %d", soma);
	}
}