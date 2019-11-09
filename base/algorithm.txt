Goals: 
create a program which reads in data and stores it into an arraylist, saves to a .dat file and allows you to
admin menu
delete a user 
list all users
apply interest to all savings accounts
exit
The user menu 
get checking balance
deposit into checking
withdraw from checking
get savings balance
deposit into savings
withdraw from savings
exit
also users will have a account number and pin number

Input: the user will have to input a pin and then an account number, if they match a user in the arraylist then,

the user will input from a menu, there input will be an int and will do the different things explained in goal, 1-5 for adminmenu, 1-7 for user menu


Output:
In the console I will display the user and admin menus respectivly base on the users input for the account number and pin number

----------------------------------------------------------------------------------------------------------------------------------
Checking_Account 

Goal: define checking_account class

input, values passed from user class, passed from atm class

Depositmoney method will add the money passed and add that money to the checkingaccounts balance property 

WithdrawMoney will take the withdraw amount passed and subtract the withdraw amount from the balance, balance cannot be 0 for this method to be called

CheckBalance will simply return the balance amount

----------------------------------------------------------------------------------------------------------------------------------

Savings_Account

goal: define savings_Account class

input, values passed from user class, passed from atm class


this class will inherit from checking_Account

it will also add and interest rate property and an applyInterest method

The applyInterest method will be passed time, it will then take the savings account balance and multiply its by the classes passed interest rate and by the classes passed time amount in months

-------------------------------------------------------------------------------------------------------------------------------

User

goal define user class

input passed from atm class

this class will have a pin property, accountnumber, and interest rate

it will also make an instance of the checkingaccount class and the savingsaccount class which will be passed the rate property


ReturnPin method will return the pin

ReturnAccountNumber method will return Account number

checkBalace method, will call the CheckingAccount checkBalance method

depositChecking will be passed an amount and it will call the checkingAccount Deposit money class passing it the amount

WithdrawChecking will be passed an amount and call the checkingAccount WithdrawMoney method and pass it the amount

the savingbalance method is the same as the checkbalance method but it calls the savingsAccount method respectivly 

the depositSavings method is the same as the checkbalance method but it calls the savingsAccount method respectivly 
the WithdrawSavings  method is the same as the checkbalance method but it calls the savingsAccount method respectivly 

The applyInterest method will be pass the time in months and call the SavingsAccount method ApplyInterest and pass it the time

------------------------------------------------------------------------------------------------------------------------------------

ATM 

goal define atm class



make all needed variables, scanners, bools, etc

make a blank arraylist of type User 

load the serialized saved arraylist if it exists

Make the admin menu

Make the User Menu

Serialize the arraylist after exiting both admin menu and user menu


