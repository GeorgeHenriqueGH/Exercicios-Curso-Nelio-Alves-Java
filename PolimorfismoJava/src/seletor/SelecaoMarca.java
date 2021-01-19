package seletor;

import carro.TipoCarro;
import utilitarios.CaixasDeDialogo;

public class SelecaoMarca extends TipoCarro implements Escolha{  //Clase responsavel por fazer o polimorfismo

	CaixasDeDialogo caixa = new CaixasDeDialogo();
	TipoCarro carro = new TipoCarro();
	
	@Override
	public int Selecionar(int opc) {
		if (opc == 1) {
			carro.setNomeCarro("Fiat Uno");
			carro.setAnoFabricacao("1990");
			carro.setModeloDoCarro("Econômico");
			carro.setTipoDeCarro("Família");
			carro.setCorCarro("Prata");

			caixa.CaixaDiaLogo("Nome:\n" + carro.getNomeCarro() + "\ndata de fabricão " + carro.getAnoFabricacao() + "\nModelo " + carro.getModeloDoCarro() + "\nTipo " + carro.getTipoDeCarro() + "\nCor do carro " + carro.getCorCarro());
		}else {
			caixa.CaixaDiaLogo("Opção invalida!");
			System.exit(0);
		}
		return opc;
	}

}
