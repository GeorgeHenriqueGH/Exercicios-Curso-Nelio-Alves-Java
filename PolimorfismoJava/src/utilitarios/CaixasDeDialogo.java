package utilitarios;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CaixasDeDialogo { // Classe de utilidades da view do programa em polimorfismo

	public void EstiloCaixa() {
		UIManager.put("Panel.background", new Color(28, 38, 54));
		UIManager.put("Panel.foreground", new Color(255, 255, 255));
		UIManager.getDefaults().put("OptionPane.background", new Color(28, 38, 54));
		UIManager.getDefaults().put("OptionPane.foreground", new Color(255, 255, 255));
		UIManager.put("OptionPane.messageFont", new Font("Monospace", Font.BOLD, 16));
	}

	public String CaixaDiaLogo(String textoAmostra) {
		EstiloCaixa();
		JOptionPane.showMessageDialog(null, textoAmostra);
		return textoAmostra;
	}
	
}
