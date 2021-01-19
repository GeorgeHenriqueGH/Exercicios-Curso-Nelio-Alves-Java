package view;

import tipoPersonagens.EuSou;
import utilitarios.UtilitarioDeDialog;

public class EuSouUm {

	public static void main(String[] args) {
	
		EuSou sou = new EuSou();
		UtilitarioDeDialog caixa = new UtilitarioDeDialog();
		
		caixa.CaixaMostrar("Marvel Personagens");
		
		sou.meuNome(2);

		System.exit(0);
	}

}
