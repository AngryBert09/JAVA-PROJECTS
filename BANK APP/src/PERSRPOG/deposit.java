package PERSRPOG;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class deposit {
	
	banko s = new banko();
 
	void deposit(int depo , int balance) {
		// If the user is already done deposit the program will print a receipt
		 System.out.print("\n*** THANK YOU PLS COME BACK *** \n");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		 System.out.println(dtf.format(now));  
		 System.out.print("\nYOU DEPOSIT : " + depo );
		 System.out.print("\nBALANCE : " + balance);
		
	}
	
	void withdraw(int with , int balance) {
		// In this part if the user is done the program will print a witdraw receipt 
		 if(with > balance) {
			 System.out.print("INSUFFICIENT FUNDS");
		 } else { System.out.print("\n*** THANK YOU PLS COME BACK *** \n");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		 System.out.println(dtf.format(now));  
		 System.out.print("\nYOU WITHDRAW : " + with );
		 System.out.print("\nBALANCE : " + balance);
		 }
	}
	    
}
