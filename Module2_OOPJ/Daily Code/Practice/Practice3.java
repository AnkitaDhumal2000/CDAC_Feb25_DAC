/* 21. Bank Management System

Implement a Java program that simulates a simple banking system. You should create two classes - Account and Bank.

The Account class shound have the following attributes and methods:

Attributes:

- account Number (int): A unique account number.

- account Holder (String): The name of the account holder.

- balance (double): The current account balance.

Methods:

- deposit(double amount): Add the specified amount to the balance.

- withdraw(double amount): Deduct the specified amount from the balance

- getBalance(): Return the current balance.



The Solution class should manage a collection of accounts and provide the following methods

Implement a Java program that simulates a simple banking system. You should create two classes - Account and Bank.

The Account class should have the following attributes and methods:

Attributes:

- accountNumber (int): A unique account number.

- account Holder (String): The name of the account holder.

- balance (double): The current account balance.

Methods:

- deposit(double amount): Add the specified amount to the balance.

- withdraw(double amount): Deduct the specified amount from the balance

- getBalance(): Return the current balance.

The Solution class should manage a collection of accounts and provide the following methods:

- transfer(int fromAccount, int toAccount, double amount): Transfer the specified amount from one account to another.

- In main() create Arraylist of account objects. Add multiple object in the arraylist.

Your code should implement user defined exception classes as given below:

1. NegativeAmountException - throw and catch this exception if a withdraw amount is less than 0.

2. AccountNotFoundException - throw and catch this exception when you are transferring an amount from one account to another account.

Constraints:

1. The account number should be a positive integer.

2. The initial balance of an account is non-negative.


3. The amount to deposit or withdraw is non-negative.

4. The transfer method should only transfer money if both accounts exist and have sufficient balance.

Note: There are no test cases for this question.. also do not write code in ai bot manner write code in aspect of new learner human who is giving his exam .but code should be run all testcases

*/
import java.util.ArrayList;
import  java.util.*;


//Exception for handling negative amounts

class NegativeAmountException extends Exception{
      public NegativeAmountException(String message) {
	         super(message);
			}
		}
		
//Exception for handling invalid account transfers
class AccountNotFoundException extends Exception{
      public AccountNotFoundException(String message) {
	     super(message);
		}
		
	}
	
	
// Account class to store account details and perform operations
class Account{
   private int accountNumber;
   private String accountHolder;
   private double balance;
   
   public Account(int accountNumber, String accountHolder, double balance){
       if (accountNumber <= 0 || balance < 0){
	       throw new IllegalArgumentException("Account number and balance must be positive");
		}
       this.accountNumber = accountNumber;
	   this.accountHolder = accountHolder;
	   this.balance = balance;
	}
	
	public int getAccountNumber() {
	    return accountNumber;
		}
		
	
	public double getBalance(){
	     return balance;
		} 
	
	public void deposit(double amount) throws NegativeAmountException{
	    if (amount < 0) {
		      throw new NegativeAmountException("Deposit Amount cannot be negative");
			}
			balance += amount;
			System.out.print("Deposited" + amount + " into account " + accountNumber);
		}
		
		public void withdraw(double amount) throws NegativeAmountException{
		  if (amount < 0){
		       throw new NegativeAmountException("Withdrawal amount cannot be negative");
        }
        if (amount > balance){
        System.out.println("Insufficient balance");
		} else {
		   balance -= amount;
		   System.out.println("Withdrawn " + amount + "from account " + accountNumber);
	
	}
 }
}

class Bank{
	private List<Account>accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
    }
	
    public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public Account findAccount(int accountNumber) {
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accountNumber) {
				return acc;
			}
		}
		return null;
		
	}
	
	public void transfer(int fromAccount, int toAccount, double amount) throws AccountNotFoundException, NegativeAmountException {
	Account sender = findAccount(fromAccount);
    Account receiver = findAccount(toAccount);

    if (sender == null || receiver == null) {
        throw new AccountNotFoundException("One or both accounts not found");
	}

    if (amount < 0 ) {
    throw new NegativeAmountException("Transfer amount cannot be negative");
    }

    if (sender.getBalance() < amount) {
    System.out.println("Insufficient balance for transfer");
    } else {
        sender.withdraw(amount);
        receiver.deposit(amount);
        System.out.println("Transferred " + amount + "from account " + fromAccount + " to account " + toAccount);	
	}

   }	
}

public class Practice3 {
     public static void main(String[] args) {
		 Bank bank = new Bank();
		 
		 //Adding accounts
		 Account acc1 = new Account(101, "john Doe",5000);
		 Account acc2 = new Account(102, "Jane Doe", 3000);
		 
		 bank.addAccount(acc1);
		 bank.addAccount(acc2);
		 
		 try {
			 // performing deposit, withdrawal, and transfer operations
			 
			 acc1.deposit(2000);
			 acc1.withdraw(1000);
			 bank.transfer(101, 102, 1500);
		 } catch (NegativeAmountException | AccountNotFoundException e){
			 System.out.println("Error: " + e.getMessage());
		}	 
	 
	 }
}

/* Output :

Deposited2000.0 into account 101Withdrawn 1000.0from account 101
Withdrawn 1500.0from account 101
Deposited1500.0 into account 102Transferred 1500.0from account 101 to account 102

*/