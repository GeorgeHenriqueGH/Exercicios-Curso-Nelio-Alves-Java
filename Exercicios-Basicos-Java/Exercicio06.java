import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);			

			System.out.println("Exercício de, fixação!!  " + args[0] + " tanto faz, o que você digitou!!\n\r");
			System.out.println("Digite seu nome: ");
			String nome  = 	ler.next();
			
			System.out.println("Bem vindo a nossa, zona de teste!  " +  nome + "\n\rDigite sua idade: ");
			double idadeUsuario = ler.nextDouble();
			double potencia = Math.pow(idadeUsuario, 2);
			System.out.println("Sua idade está sendo elevado a 2 devido, ao seu \"Sobre peso!\" "  + potencia);
			
			char leco = 0b11111011;			
			System.out.println("Você  " + nome + " " + leco  + "  Digite a idade da sua mãe!\n\r");
			double idadeMae = ler.nextDouble();
			boolean verdadeiroOuFalso = idadeUsuario != idadeMae;
			String decoracao = "(}====x(#)O================>   ( ͡ °~͡° )";

			System.out.println("Sua mãe é melhor que você  " + verdadeiroOuFalso + "  " + decoracao);			
			
			System.exit(0);

	}

}
