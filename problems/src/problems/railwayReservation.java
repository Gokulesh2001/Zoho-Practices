package problems;
import java.util.*;

public class railwayReservation extends coach {

	static Scanner sc=new Scanner(System.in);
	
	allGroups ag=new allGroups();
	
	 void getDetails() {
		
		System.out.println("----------------------Railway Reservation----------------------");
		System.out.println("Enter a choice:");
		System.out.println("1. Book Ticket");
		System.out.println("2. Cancel Ticket");
		System.out.println("3. Print All");
		System.out.println("4. Print Availability");
		System.out.println("5. Exit");
		int ch=sc.nextInt();
		switch(ch) {
			case 1:{
			   bookTicket();
			   getDetails();
			   }
			case 2:{
				cancelTicket();
				getDetails();
			   }
			case 3:{
				printAll();
				getDetails();
			   }
			case 4:{
				printAvailability();
				getDetails();
			   }
			case 5:{
				return;
			   }
			default:{
				System.out.println("Please enter a valid choice:");
				getDetails();
			}
		}
	}
	
	 void bookTicket() {
		int preferenceChange=0;
		groupOfPassengers dp=new groupOfPassengers();
		boolean yes=true;
		while(yes) {
		sc.nextLine();
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Preference:");
		String preference=sc.nextLine();
		
		passenger p=new passenger(name,age,preference);
		if(p.age<=5) {
			preferenceChange=1;
		}
		dp.group.add(p);
		
		System.out.println("Do you want to book one more? (Y/N)");
	    char oneMore=sc.next().charAt(0);
		yes=yes && (oneMore=='Y'?true:false);
		
			
			if(p.age>60&&lower>0 || lower>0 && p.preference.equals("lower") ||lower>0 && p.preference.equals("")) {
				p.preference="lower";
				lower--;
				continue;
			}
			if(preferenceChange==1) {
				p.preference="lower";
				lower--;
				continue;
			}
			if(upper>0&&p.preference.equals("upper")|| upper>0&&p.preference.equals("")) {
				p.preference="upper";
				upper--;
				continue;
			}
            if(sideUpper>0 &&p.preference.equals("sideUpper")|| sideUpper>0 &&p.preference.equals("")) {
            	p.preference="sideUpper";
            	sideUpper--;
            	continue;
            }
			if(sideLower>0&&p.preference.equals("sideLower") || sideLower>0&&p.preference.equals("")) {
				p.preference="sideLower";
				sideLower--;
				continue;
			}
			if(waitList>0) {
				p.preference="waitList";
				waitList--;
				continue;
			}
			System.out.println("Sorry, No tickets are available for booking.");
			System.out.println("Sorry, Your booking is cancelled.");
//			ag.ag.add(dp);
//			printTicket(dp);
			return;
		}
		ag.ag.add(dp);
		printTicket(dp);
		}
		
	 void printTicket(groupOfPassengers dp){
		System.out.println("------------Tickets Booked------------------");
		System.out.println("Name         Age        Preference");
		
		for(passenger p:dp.group) {

			System.out.println(p.name+"             "+p.age+"          "+p.preference);
		}
		
		
	}
	
	 void printAvailability() {
		System.out.println("--------------------Available Tickets--------------------");
		System.out.println("Lower_Berth  Upper_Berth  Middle_Berth  Side_Upper_Berth  Side_Lower_Berth");
		System.out.println(" "+lower+"                "+upper+"                "+middle+"                "+sideUpper+"                "+sideLower);
		
	}
	
	 void printAll() {
		 System.out.println("------------All Booked tickets------------------");
		 System.out.println("Name         Age        Preference");
		 for(groupOfPassengers d:ag.ag) {
		 for(passenger p:d.group) {

				System.out.println(p.name+"             "+p.age+"          "+p.preference);
			}
		 }
	 }
	 
	 void cancelTicket() {
		 sc.nextLine();
		 System.out.println("------------Ticket cancellation------------------");
		 System.out.println("Enter name:");
		 String name=sc.nextLine();
		 for(groupOfPassengers d:ag.ag) {
			 for(passenger p:d.group) {
                   if(p.name.equals(name)) {
                	   System.out.println(p.name+"             "+p.age+"          "+p.preference+" is cancelled");
                	   if(p.preference.equals("upper")) {
                		   
                	   }
                	   else if(p.preference.equals("lower")) {
                		   lower++;
                	   }
                	   else if(p.preference.equals("upper")) {
                		   upper++;
                	   }
                	   else if(p.preference.equals("sideLower")) {
                		   sideLower++;
                	   }
                	   else if(p.preference.equals("sideUpper")) {
                		   sideUpper++;
                	   }
                	   else if(p.preference.equals("middle")) {
                		   middle++;
                	   }
                	   else if(p.preference.equals("waitList")) {
                		   waitList++;
                	   }
                	   d.group.remove(p);
                	  
                	   
                	   break;
                   }
					
				}
			 }
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		railwayReservation rr=new railwayReservation();
		rr.getDetails();
	}

}
