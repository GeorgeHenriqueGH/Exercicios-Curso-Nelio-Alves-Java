import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner escanear = new Scanner(System.in);
		
		System.out.println("Seja bem vindo, qualquer coisa que você digitou  " + args[0] + "!!\n\rDigite seu nome: ");
		String nome = escanear.nextLine();
		char decoracao = 00243;
		System.out.println(nome + " você é um (a) bosta!! " + decoracao + "\n\r");
		
		int estadosUnidosDaAmericaColonizasao = 0b11011011010;
		System.out.println("O Estados Unidos da America foi colonizado em " + estadosUnidosDaAmericaColonizasao);
		
		System.out.println("Digite um número: ");
		double n1 = escanear.nextDouble();
		System.out.println("Digite outro número: ");
		double n2 = escanear.nextDouble();		
		
		double soma = n1 * n2;
		System.out.println("A soma é:  " + soma);
		
		boolean lesbica = true;
		boolean hetero = false;
		
		boolean resposta = lesbica != hetero;
		char decoracao2 = 00156;
		String indentidade = "⚢";
		
		System.out.println("Minha irmã é lesbica?  " + resposta + " " + decoracao2 + indentidade);		

		System.exit(0);	
	
	}

}
