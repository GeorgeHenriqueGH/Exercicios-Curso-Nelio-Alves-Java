package tipoPersonagens;

import utilitarios.UtilitarioDeDialog;

public class EuSou extends HeroiOuVialao implements Hero {

	UtilitarioDeDialog caixa = new UtilitarioDeDialog();
	
	@Override
	public int meuNome(int selecionar) {
		
		if(selecionar != 0) {
			switch (selecionar) {
			case 1:
				setHeroiOuVilao("Homem Aranha");
				setInimigos("Duende Verde, Venom");
				setPoderes("Escalar Paredes, Super Força e Sensor Aranha");
				setNivelPoder("Nivel Urbano");
				caixa.CaixaMostrar("Nome: " + getHeroiOuVilao() + "\nInimigos: " + getInimigos() + "\nPoderes: " + getPoderes() + "\nNivel de poder: " + getNivelPoder());
				break;
			case 2:				
				setHeroiOuVilao("Magneto");
				setInimigos("X-mens, Vingadores");
				setPoderes("Magnetismo de todo tipo");
				setNivelPoder("Nivel Omega");
				caixa.CaixaMostrar("Nome: " + getHeroiOuVilao() + "\nInimigos: " + getInimigos() + "\nPoderes: " + getPoderes() + "\nNivel de poder: " + getNivelPoder());
				break;
			default:
				caixa.CaixaMostrar("Opção invalida");
				break;
			}
		}
		
		return 0;
	}

}
