package exercicios;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		/*escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o codígo do produto: ");
		int opc = scan.nextInt();

		System.out.print("Digite a quantidade do produto: ");
		int qtdProduto = scan.nextInt();
		
		double produto = 0;
		
		switch(opc) {
			case 1:
				produto = qtdProduto * 4.00;
				break;
			case 2:
				produto = qtdProduto * 4.5;
				break;
			case 3:
				produto = qtdProduto * 5.00;
				break;
			case 4:
				produto = qtdProduto * 2.00;
				break;
			case 5:
				produto = qtdProduto * 1.50;
				break;
				default:
					System.out.println("Erro!!\n tente novamente!");
					main(args);
		}
		
		System.out.print("Resultado: " + produto);
		
		scan.close();
		
	}

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      