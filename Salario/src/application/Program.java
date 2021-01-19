package application;

import javax.swing.JOptionPane;
import entities.Salary;

public class Program {

	public static void main(String[] args) {
		Salary salario = new Salary();
		
		salario.name =  JOptionPane.showInputDialog("Name:");
		salario.grossSalary = Double.parseDouble(JOptionPane.showInputDialog("Gross salary:"));
		salario.tax = Double.parseDouble(JOptionPane.showInputDialog("Tax:"));
		
		JOptionPane.showMessageDialog(null, "Employee: " + salario.name + ", $ " + salario.netSalary());
		
		double percentage = Double.parseDouble(JOptionPane.showInputDialog("Which percentage to increase salary?"));
		salario.increaseSalary(percentage);
		
		JOptionPane.showMessageDialog(null, "Updated data: "  + salario.name + ", $ " +  salario.netSalary());
	}

}