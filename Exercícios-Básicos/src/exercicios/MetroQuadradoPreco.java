package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MetroQuadradoPreco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a largura: ");
		double largura = scan.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Digite o preço metro quadrado: ");
		double metroQuadrado = scan.nextDouble();
		
		double area = largura * altura;
		double valor = area * metroQuadrado;
		
		System.out.printf("Área: %.2f%n", area);
		System.out.printf("Preço: %.2f%n", valor);
		
		scan.close();
	}

}