package exercicios;

import java.util.Scanner;

public class NumerosMultiplos {
	
	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). Após, 
		  o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	      Multiplos", indicando se os valores lidos são múltiplos entre si. 
	      Atenção: os números devem poder ser digitados em
          ordem crescente ou decrescente.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = scan.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São Multiplos.");
		}
		else {
			System.out.println("Não são Multiplos.");
		}
		scan.close();
	}
	
}