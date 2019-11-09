

import java.util.*;
import java.io.*;

public class ATM {

	
	
	public static void main(String[] args) {
		ATM atm = new ATM();

	}
	
	public ATM ()
	{
		ArrayList<User> List_Of_Users = new ArrayList();
		
		boolean KeepGoing = true;
		boolean KeepGoing2 = true; 
		boolean KeepGoing3 = true; 
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		Scanner scan6 = new Scanner(System.in);
		Scanner scan7 = new Scanner(System.in);
		Scanner scan8 = new Scanner(System.in);
		Scanner scan9 = new Scanner(System.in);
		Scanner scan10 = new Scanner(System.in);
		Scanner scan11 = new Scanner(System.in);
		Scanner scan12 = new Scanner(System.in);
		
		//int AccountNumber = 12345;
		//int pin = 1234;
		//int AccountNumber2 = 12;
		//int pin2 = 1;
		//int AccountNumber3 = 123;
		//int pin3 = 123;
		
		//User User1 = new User(pin, AccountNumber);
		//User User2 = new User(pin2, AccountNumber2);
		
		//User User3 = new User(pin3, AccountNumber3);
		
		
		//List_Of_Users.add(User1);
		//List_Of_Users.add(User2);
		//List_Of_Users.add(User3);
		
		
		 try
	        {
	            FileInputStream fis = new FileInputStream("SavedUsers.dat");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            List_Of_Users = (ArrayList) ois.readObject();
	            ois.close();
	            fis.close();
	         }catch(IOException ioe){
	             ioe.printStackTrace();
	             return;
	          }catch(ClassNotFoundException c){
	             System.out.println("Class not found");
	             c.printStackTrace();
	             return;
	          }
	        
	   
		
		
		
		
		
		while(KeepGoing == true)
		{
			
			
			System.out.println("Enter in a pin, must be a valid number: ");
			
			while(!scan.hasNextInt()) {
			  scan.next();
			}
			int input = scan.nextInt();
			
			System.out.println("Enter in a Account Number, must be a valid number: ");
			
			while(!scan2.hasNextInt()) {
			   scan2.next();
			}
			int input2 = scan2.nextInt();
			
			if (input == 00000)
			{
				if(input2 == 12345)
				{
					
					while(KeepGoing3 == true)
					{
					System.out.println("What would you like to do?");
			 		System.out.println("1, add a user, must be entered as shown");
			 		System.out.println("2, delete a user, must be entered as shown");
			 		System.out.println("3, list all users, must be entered as shown");
			 		System.out.println("4, apply interest to all saving account balances, must be entered as shown");
			 		System.out.println("5, exit from atm, must be entered as shown");
					
					while(!scan4.hasNextInt()) {
					   scan4.next();
					}
					int input4 = scan4.nextInt();
					
					if (input4 == 1)
					{
						System.out.println("Enter in New Users Pin, must be a valid number");
						while(!scan5.hasNextInt()) {
							   scan5.next();
							}
							int input5 = scan5.nextInt();
							
							int new_pin = input5;
						System.out.println("Enter in New Users Account Number, must be a valid number");
						while(!scan6.hasNextInt()) {
								scan6.next();
								}
						
						int input6 = scan6.nextInt();
								
						int new_AccountNumber = input6;
								
						User NewUser = new User(new_pin, new_AccountNumber);
								
						List_Of_Users.add(NewUser);
						
					}
					else if (input4 == 2)
					{
						System.out.println("Which user do you want to delete enter in a valid number (0 is first user)" );
						while(!scan7.hasNextInt()) {
							scan7.next();
							}
						int input7 = scan7.nextInt();
						
						int i = input7;
						
							
								System.out.println("I work pog");
								if(List_Of_Users.get(i).checkBalance() == 0 && List_Of_Users.get(i).savingBalance() == 0)
								{
									List_Of_Users.remove(i);
								}
								else
								{
									System.out.println("User must have an empty account ");
								}
							
						
						
					}
					else if (input4 == 3)
					{
						for (int i = 0; i < List_Of_Users.size(); i++)
						{
							
							System.out.println("Users pin: " + List_Of_Users.get(i).Return_Pin() + " Account Number :" + List_Of_Users.get(i).Return_Account_Number());
						}
					}
					else if (input4 == 4)
					{
						System.out.println("How many months would you like to apply, must be a valid number");
						while(!scan8.hasNextInt()) {
							  scan8.next();
							}
							int input8 = scan8.nextInt();
							for (int i = 0; i < List_Of_Users.size(); i++)
							{
							List_Of_Users.get(i).applyInterest(input8);
							}
					}
					else if (input4 == 5)
					{
						System.out.println("Exiting Atm");
						KeepGoing3 = false;
						KeepGoing = false;
						
						try {
						    FileOutputStream fos = new FileOutputStream("SavedUsers.dat");
						    ObjectOutputStream oos = new ObjectOutputStream(fos);
						    oos.writeObject(List_Of_Users);
						    oos.close();
				            fos.close();
						    
						} catch (IOException ioe){
						    ioe.printStackTrace();
						} 
					    } 
						
					}
					}
				}
			
			
			for (int i = 0; i < List_Of_Users.size(); i++)
			{
				 
				 if(List_Of_Users.get(i).Return_Pin() == input )
				 {
					 //System.out.println("Match for Pin! ");
				 
				 
					 if(List_Of_Users.get(i).Return_Account_Number() == input2 )
					 
						 //System.out.println("Match for Account Number! ");
						 
					 
				 	while (KeepGoing2 == true)
				 	{
				 		System.out.println("What would you like to do?");
				 		System.out.println("1, checking account balance, must be entered as shown");
				 		System.out.println("2, deposit into checking account, must be entered as shown");
				 		System.out.println("3, withdraw from checking account, must be entered as shown");
				 		System.out.println("4, checking savings account, must be entered as shown");
				 		System.out.println("5, deposit into savings account, must be entered as shown");
				 		System.out.println("6, withdraw from savings account, must be entered as shown");
				 		System.out.println("7, exit from atm, must be entered as shown");
				 		
				 		//while(!scan.hasNextInt()) {
						//	  scan3.next();
							//}
							int input3 = scan3.nextInt();
							
						if (input3 == 1)
						{
							System.out.println("Balance: " + List_Of_Users.get(i).checkBalance());
						}
						else if (input3 == 2)
						{
							
							System.out.println("How much would you like to deposit?");
							while(!scan9.hasNextInt()) {
								   scan9.next();
								}
								int depositAmount = scan9.nextInt();
							
							List_Of_Users.get(i).depositChecking(depositAmount);
						}
						else if (input3 == 3)
						{
							System.out.println("How much money would you like to take from your account");
							
							while(!scan11.hasNextInt()) {
								   scan11.next();
								}
								int Withdraw_Amount = scan11.nextInt();
							
							
							
							if (Withdraw_Amount > List_Of_Users.get(i).checkBalance() )
							{
								System.out.println("You cannot take more than your accounts balance");
							}
							else
							{
							
							List_Of_Users.get(i).withdrawChecking(Withdraw_Amount);
							}
						}
						else if (input3 == 4)
						{
							System.out.println("Balance: " + List_Of_Users.get(i).savingBalance());
						}
						else if (input3 == 5)
						{
							System.out.println("How much would you like to deposit?");
							while(!scan10.hasNextInt()) {
								   scan10.next();
								}
								int DepositAmount = scan10.nextInt();
							
							
							
							List_Of_Users.get(i).depositSavings(DepositAmount);
						}
						else if(input3 == 6)
						{
							System.out.println("How much money would you like to take from your account");
							
							while(!scan12.hasNextInt()) {
								   scan12.next();
								}
								int WithdrawAmount = scan12.nextInt();
							
							
							
							if (WithdrawAmount > List_Of_Users.get(i).savingBalance() )
							{
								System.out.println("You cannot take more than your accounts balance");
							}
							else
							{
							
							List_Of_Users.get(i).withdrawSavings(WithdrawAmount);
							}
							
							
							
						}
						else if(input3 == 7)
						{
							System.out.println("Exiting out of atm");
							KeepGoing2 = false;
							KeepGoing = false;
							
							try {
							    FileOutputStream fos = new FileOutputStream("SavedUsers.dat");
							    ObjectOutputStream oos = new ObjectOutputStream(fos);
							    oos.writeObject(List_Of_Users);
							    oos.close();
					            fos.close();
							    
							} catch (IOException ioe){
							    ioe.printStackTrace();
						}
				 	}
				 
				 
				 }
					 else
					 {
						 KeepGoing = false; 
					 //System.out.println("Not a valid pin and Account Number");
					 }
					 
				
				 }
				 
			
			}
		
		
	}
	 
}
	
	
}
	
