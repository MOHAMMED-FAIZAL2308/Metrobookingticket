package metrotravelticket;

import java.util.Scanner;
import java.util.Random;


class ticket{
	static int ticketcounter;
	double ticketprice;
	int ticketid;
	String name;
	int age;
	int choice;
	String distination;
	String source;
	int distanceKM = 0;;
	static Scanner obj = new Scanner(System.in);
	public void passengers() {
		System.out.println("enter your name:");
		name = obj.nextLine();
		System.out.println("enter your age:");
		age = obj.nextInt();
		obj.nextLine();	
		
		Random random = new Random();
		ticketid = 100000 + random.nextInt();
		System.out.println("generated ticketid:"+ ticketid);
	}
	public void choosetransport() {
		System.out.println("---select a transport type---");
		System.out.println("1. Metro train");
		System.out.println("2.Local trains");
		System.out.println("3.MTC bus");
		System.out.println("enter your transport type:");
		choice = obj.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Metro train");
			break;
		case 2:
			System.out.println("local train");
			break;
		case 3:
			System.out.println("Mtc bus");
			break;
			default:
				System.out.println("invalid choice ! select valid option");
			
		}
		
	}
	public void distance() {
		obj.nextLine();
		System.out.println("enter your starting point:");
		source = obj.nextLine();
		System.out.println("enter your destination point:");
		distination = obj.nextLine();
		if (source.equalsIgnoreCase("MGR CHENNAI CENTRAL") && distination.equalsIgnoreCase("CHENNAI AIRPORT")) {
            distanceKM = 17;
            System.out.println("Total distance: " + distanceKM + " KM");
        }
		else if(source.equalsIgnoreCase("arakkonam") && distination.equalsIgnoreCase("mgr chennai central") ) {
			distanceKM = 68;
			System.out.println("total distance:"+distanceKM+"KM");
			
		}
		else if(source.equalsIgnoreCase("chennai beach") && distination.equalsIgnoreCase("tambram")) {
			distanceKM = 25;
			System.out.println("total distance:"+distanceKM+"KM");
		}
		else if(source.equalsIgnoreCase("chennai beach") && distination.equalsIgnoreCase("vellachery")) {
			distanceKM = 28;
			System.out.println("total distance:"+distanceKM+"KM");
		}
		else if(source.equalsIgnoreCase("chennai airport")&& distination.equalsIgnoreCase("wimconagardepot")) {
			distanceKM = 40;
			System.out.println("total distance:"+distanceKM+"KM");
		}
		else {
            System.out.println("Route not predefined. Please enter distance in KM:");
            distanceKM = obj.nextInt();
            obj.nextLine();  // Consume newline
        }
		switch (choice) {
		case 1:
			ticketprice = distanceKM * 3;
			break;
		case 2:
			ticketprice = distanceKM * 2;
			break;
		case 3:
			ticketprice = distanceKM * 1.5;
			break;
		default:
			ticketprice = 0;
			System.out.println("invalid transport type! fair can't be calculated ");
			return;
			
			
		}
		System.out.println("your ticketprice is :₹"+ticketprice);
		
	}
	public void display() {
		System.out.println("------ passengers ticket details-----");
		System.out.println(" passenger name:"+name);
		System.out.println(" passenger age:"+age);
		System.out.println(" Ticket id:"+ticketid);
		System.out.println(" transport type:"+choice);
		System.out.println(" From:"+source);
		System.out.println(" To:"+distination);
		System.out.println(" distance KM:"+distanceKM);
		System.out.println(" ticket price:"+ticketprice);
	}
	
	
	
}


public class Metroticketbooking {
	public static void main(String[] args) {
		while (true) {
		ticket sc = new ticket();
		sc.passengers();
		sc.choosetransport();
		sc.distance();
		sc.display();
		
		System.out.println("do you want to book another tickets(yes/no):");
		String morepassengers = ticket.obj.nextLine();
		if(morepassengers.equalsIgnoreCase("no")){
			System.out.println("thank you for booking metro travell ticket booking");
			break;
			
			
		}
		
	}
	}
	


	

}
