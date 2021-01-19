import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner escanear = new Scanner(System.in);		

		char copyright =  0xa9;	
		String cat = "ฅ^•ﻌ•^ฅ";
		String espada = "o==}::::::::::::>";

		System.out.println("Leitura teclado " + copyright);

		System.out.println("Digite sua idade:\r");
		int idade = escanear.nextInt();
		System.out.println("Você tem, " + idade + " anos" );
			
		System.out.println("Digite seu altura:\r");
		int altura = escanear.nextInt();
		System.out.println("Você tem " + altura + " de altura!");
		
		double poder = 8000.000;
		
		System.out.println("Digite seu nome\r");
		String nome = escanear.next();
		System.out.println(nome + " Seu poder é de mais  " + poder + " "  + cat + " " + espada);

		System.exit(0);	
	
	}

}
