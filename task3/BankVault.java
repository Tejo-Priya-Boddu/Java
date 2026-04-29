/*​2. The Secure Bank Vault 
​Task: Create a BankAccount class. Declare a private double balance.
​Goal: Write a public getter method to read the balance, and a public setter method to deposit money. In the setter,
 write an if condition so that it only updates the balance if the deposit amount is greater than 0. Test this in your main method.*/

class BankAccount
{
	private double balance ;
	
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		if(balance > 0)
		{
			this.balance = balance;
		}
		else
		{
			System.out.println("deposit amount is less than 0");
		}
	}
}

public class BankVault
{
	public static void main(String arg[])
	{
		BankAccount obj = new BankAccount();
		obj.setBalance(0);
		double r1 = obj.getBalance();
		System.out.println("current balance " + r1);
		obj.setBalance(2345);
		double r2 = obj.getBalance();
		System.out.println("current balance " + r2);
		
	}
}
