package subticket;

import metrotravelticket.Ticket;
import java.util.Scanner;

public class Ticketcounter {
	public static void main(String[] args) {
		while (true) {
		Ticket sc = new Ticket();
		sc.passengers();
		sc.choosetransport();
		sc.distance();
		sc.display();
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("do you want to book another Ticket (Yes/No):");
		String morepassengers = obj.nextLine();
		if(morepassengers.equalsIgnoreCase("no")){
			System.out.println("thank you for booking metro travell ticket booking");
			break;
			
			
		}
		
	}
	}
	


	

}


