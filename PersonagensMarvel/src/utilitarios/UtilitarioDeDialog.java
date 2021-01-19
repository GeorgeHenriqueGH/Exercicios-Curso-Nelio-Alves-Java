package utilitarios;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UtilitarioDeDialog {

	public void EstiloCaixa() {
		UIManager.put("Panel.background", new Color(28, 38, 54));
		UIManager.put("Panel.foreground", new Color(255, 255, 255));
		UIManager.getDefaults().put("OptionPane.background", new Color(28, 38, 54));
		UIManager.getDefaults().put("OptionPane.foreground", new Color(255, 255, 255));
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 16));
	}
	
	public void CaixaMostrar(String texto) {
		EstiloCaixa();
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public String CaixaEntradaDeDados(String textoDado) {
		EstiloCaixa();
		JOptionPane.showInputDialog(textoDado);
		return textoDado;
	}
	
}
