package exercicios;

import java.util.Scanner;

public class DiferencaEntreProdutos {
	
	public static void main(String[] args) {
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		  A seguir, calcule e mostre a diferença do produto
          de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		*/
		
		Scanner scan = new Scanner(System.in);
		int A, B, C, D, diferenca;
		
		System.out.println("Digite o valor do produto A:");
	    A = scan.nextInt();
	    
		System.out.println("Digite o valor do produto B:");
	    B = scan.nextInt();
	    
		System.out.println("Digite o valor do produto C:");
	    C = scan.nextInt();
	    
		System.out.println("Digite o valor do produto D:");
	    D = scan.nextInt();
	    
	    diferenca = (A * B - C * D);
	    System.out.print("A diferença é: " + diferenca);
	    scan.close();
	}
	
}
