

import java.util.Scanner;
import java.io.*;

public class Checking_Account implements Serializable {

	int balance;
	
	
	
	public Checking_Account()
	{
		
		this.balance = 0;
			
			
		}
		
		void Deposit_Money(int Deposit_Amount)
		{
			
			this.balance += Deposit_Amount;
	}
	
		void Withdraw_Money(int Withdraw_Amount)
		{
			
				this.balance -= Withdraw_Amount;
			
			
		}
		int Check_Balance()
		{
			return this.balance;
		}
		
}
