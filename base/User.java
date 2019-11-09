import java.io.*;

public class User implements Serializable {
	int pin;
	int Account_Number;
	int rate = 4;
	
	Checking_Account CheckingAccount = new Checking_Account();
	Savings_Account SavingsAccount = new Savings_Account(rate);
	
	public User(int pin, int Account_Number)
	{
		
		this.pin = pin;
		this.Account_Number = Account_Number;
		
	}
	
	int Return_Pin()
	{
		return this.pin;
	}
	
	int Return_Account_Number()
	{
		return this.Account_Number;
	}
	
	int checkBalance()
	{
		return CheckingAccount.Check_Balance();
	}
	void depositChecking(int depositAmount)
	{
		CheckingAccount.Deposit_Money(depositAmount);
	}
	void withdrawChecking(int withdrawAmount)
	{
		CheckingAccount.Withdraw_Money(withdrawAmount);
	}
	
	int savingBalance()
	{
		return SavingsAccount.Check_Balance();
	}
	void depositSavings(int DepositAmount)
	{
		SavingsAccount.Deposit_Money(DepositAmount);
	}
	void withdrawSavings(int WithdrawAmount)
	{
		SavingsAccount.Withdraw_Money(WithdrawAmount);
	}
	void applyInterest(int time)
	{
		SavingsAccount.Apply_Interest(time);
	}
	
}
