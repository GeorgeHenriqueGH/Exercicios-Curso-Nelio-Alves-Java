package program;

//import utils.Caixa;

import javax.swing.JOptionPane;

import entities.Heroes;

public class Program {

	public static void main(String[] args) {
		Heroes hero = new Heroes();
		
		hero.nome = JOptionPane.showInputDialog("Enter name hero:");
		hero.idade = JOptionPane.showInputDialog("Enter data of hero:");
		hero.poder = JOptionPane.showInputDialog("Enter power of hero");
		
		int classe = Integer.parseInt(JOptionPane.showInputDialog("Enter class of hero:\n"
		+ "1 Mage/Magician\n" + "2 Barbarian\n" + "3 Telepath\n" + "4 Human goal"));
		
		while(classe >= 5) {
			classe = Integer.parseInt(JOptionPane.showInputDialog("Enter class of hero:\n"
		    + "1 Mage/Magician\n" + "2 Barbarian\n" + "3 Telepath\n" + "4 Human goal"));
		}
		hero.classHero(classe);
		
		JOptionPane.showMessageDialog(null, hero.toString() + hero._class);
	}
}