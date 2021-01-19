package exercicios;

import java.util.Scanner;

public class SalarioFuncionarios {

	public static void main(String[] args) {
		/*
		  Fazer um programa que leia o número de um funcionário, 
		  seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
		  A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade, de funcionários:");
		int qtdFuncionarios = scan.nextInt();
		
		System.out.println("Quantidade de horas trabalhadas:");
		int qtdHoras = scan.nextInt();
		
		System.out.println("Valor hora:");
		double valorHora = scan.nextDouble();
		
		double salario = valorHora * qtdHoras;
		System.out.println("Número de funcionários: " + qtdFuncionarios);
		
		System.out.printf("Salário %.2f%n", salario);
		scan.close();
	}

}