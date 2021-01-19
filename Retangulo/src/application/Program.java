package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.x = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do triangulo"));
		retangulo.y = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do triangulo"));
		
		JOptionPane.showMessageDialog(null, "Área: " + retangulo.area());
		JOptionPane.showMessageDialog(null, "Perímetro: " + retangulo.perimetro());
		JOptionPane.showMessageDialog(null, "Diagonal: " + retangulo.diagonal());
		
	}

}
