package PERSRPOG;
import java.util.Scanner;


public class banko {

	public static void main(String[] args) {
		
	deposit q = new deposit();
	Scanner s =  new Scanner(System.in);
	Scanner x = new Scanner(System.in);
	int account = 21014571,depo,with;
	int pin = 9652;
	String ans = "",lol;
	int balance = 0;
	System.out.print("***WELCOME TO YOUR PERSONAL BANK APP**");
	System.out.print("\nACCOUNT NUMBER : ");
	int acc = s.nextInt();
	System.out.print("\nPIN : ");
	int p1n = s.nextInt();
	
	// AUTHENTICATION PART
do {	
		if(acc == account && p1n == pin) {
			System.out.print("\n***WELCOME MR.VILLANUEVA ITS NICE TO SEE YOU HERE***");
			System.out.print("\n[DEPOSIT] [WITHDRAW] [BALANCE]");
			System.out.print("\nSELECT : ");
		    ans = x.nextLine();
		} else { System.out.print("AUTHENTICATION FAILED"); }
		// If the user select deposit 
		if(ans.equalsIgnoreCase("DEPOSIT")) {
			System.out.print("ENTER AMOUNT : ");
			depo = s.nextInt();
			balance = depo + balance;	 
		    q.deposit(depo, balance);
		    
		}else if(ans.equalsIgnoreCase("WITHDRAW")){
			System.out.print("ENTER AMOUNT : ");
		    with = s.nextInt();
		    balance = balance - with;
	       q.withdraw(with, balance);
		    
		    //if the user select the withdraw
		}else if(ans.equalsIgnoreCase("BALANCE")) {
			System.out.print("\nCURRENT BALANCE : " + balance);
			// if the user select the balance
		} System.out.print("\n\nDO YOU WANT TO TRANSACT AGAIN? [YES] or [NO]\n");
		  System.out.print("SELECT : "); lol = x.nextLine();
		  
		  
		 
				}while(lol.equalsIgnoreCase("YES"));

     
            System.out.print("\n*** THANK YOU PLS COME AGAIN *** " );
            
            
	}}
	

    

		
		
		


	


