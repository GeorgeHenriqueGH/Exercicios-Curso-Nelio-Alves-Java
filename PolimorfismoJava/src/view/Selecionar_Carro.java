package view;

import utilitarios.CaixasDeDialogo;
import seletor.SelecaoMarca;

public class Selecionar_Carro {

	public static void main(String[] args) { //Classe com metodo de entrada main das classes de polimorfismo
	
		CaixasDeDialogo caixa = new CaixasDeDialogo();
		caixa.CaixaDiaLogo("Carros Polimorfismo");
		SelecaoMarca marcaCarro = new SelecaoMarca();
		marcaCarro.Selecionar(1);

		System.exit(0);
	}

}
