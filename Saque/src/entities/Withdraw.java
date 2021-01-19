package entities;

public class Withdraw {
	
	private int numberAccount;
	private String nameAccount;
	private double balance;
	private double deposit;
	
	public int getNumberAccount() { return numberAccount; }
	public void setNumberAccount(int numberAccount) { this.numberAccount = numberAccount; }

	public String getNameAccount() { return nameAccount; }
	public void setNameAccount(String nameAccount) { this.nameAccount = nameAccount; }
	
	public double getBalance() { return balance; }
	public void setBalance(double balance) { this.balance = balance; }
	
	public double getDeposit() { return deposit; }
	public void setDeposit(double deposit) { this.deposit = deposit; }
	
	public double found() { return balance += deposit; }
	
	public double fundWithdrawal() { return balance -= deposit + 5.0; }
	
	public String toString() {
		return "Account " + numberAccount + ", Holder: " + nameAccount + ", Balance: $ " + found();
	}
	
	public String toStrings() {
		return "Account " + numberAccount + ", Holder: " + nameAccount + ", Balance: $ " + fundWithdrawal();
	}
}