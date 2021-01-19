package exercicios;

import java.util.Scanner;

public class OperacaoTernaria {

	public static void main(String[] args) {
		/* Checa idade se for maior de 18 acrescenta mais um ano, 
		   fecha o programa se for menor de 18 decrescente um ano de vida.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		
		int check = (idade >= 18) ? idade++ : idade--;
		
		System.out.println("Sua idade é: " + idade++);
		scan.close();
	}

}
