package exercicios;

import java.util.Scanner;

public class SenhaCorreta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = scan.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida.");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso Permitido.");
		scan.close();
	}

}