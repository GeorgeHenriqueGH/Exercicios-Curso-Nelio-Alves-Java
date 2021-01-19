package exercicios;

import java.util.Scanner;

public class VerificaNumeroNegativa {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int negativo = scan.nextInt();
		
		if(negativo <= -1) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é positivo.");
		}
		scan.close();
	}

}
