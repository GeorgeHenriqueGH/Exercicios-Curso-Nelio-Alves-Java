package exercicios;

import java.util.Scanner;

public class ImparPar {
	
	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int imparPar = scan.nextInt();
		
		if(imparPar % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}
		scan.close();
	}
	
}