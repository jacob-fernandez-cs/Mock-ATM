import java.io.*;

public class Savings_Account extends Checking_Account implements Serializable {

	int Interest_Rate;
	
	
	public Savings_Account(int rate) {
		this.Interest_Rate = rate;
	}
	
	void Apply_Interest(int time)
	{
		int New_Amount = this.balance * (this.Interest_Rate * time);
		
		this.balance += New_Amount;
	}
	
	
}
