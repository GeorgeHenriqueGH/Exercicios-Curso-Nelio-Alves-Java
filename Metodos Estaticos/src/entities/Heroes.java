package entities;

public class Heroes {
	
	public String nome;
	public String idade;
	public String _class;
	public String poder;
	
	public int classHero(int opc) {
		switch(opc) {
			case 1:
				_class = "Mage/Magician";
				break;
			case 2:
				_class = "Barbarian";
				break;
			case 3:
				_class = "Telepath";
				break;
			case 4:
				_class = "Human goal";
				break;
				default:
					_class = "Options not found.";
				
		}
		return opc;
	}
	
	public String toString() {
		return "Name: " + nome + ",\nDate: " + idade  + ",\nPower: " + poder + ",\nClass: ";
	}
	
}