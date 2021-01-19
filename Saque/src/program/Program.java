package program;

import javax.swing.JOptionPane;
import entities.Withdraw;

public class Program {
	
	public static void main(String[] args) {
		Withdraw withdraw = new Withdraw();
		
		withdraw.setNumberAccount(Integer.parseInt(JOptionPane.showInputDialog("Enter account number:")));
		withdraw.setNameAccount(JOptionPane.showInputDialog("Enter account holder:"));
		
		String opc = JOptionPane.showInputDialog("Is there na initial deposit (y/n)?");
		
		withdraw.setBalance(Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value:")));
		while(opc == "n") {
			withdraw.setBalance(Double.parseDouble(JOptionPane.showInputDialog("Enter initial deposit value:")));
		}
		
		JOptionPane.showMessageDialog(null, "Account data:\n" + withdraw.toString());
		
		withdraw.setDeposit(Double.parseDouble(JOptionPane.showInputDialog("Enter a deposit value:")));
		JOptionPane.showMessageDialog(null, "Updated account date:\n" + withdraw.toString());
		
		withdraw.setDeposit(Double.parseDouble(JOptionPane.showInputDialog("Enter a withdraw value")));
		JOptionPane.showMessageDialog(null, "Updated account date:\n" + withdraw.toStrings());
	}
	
}