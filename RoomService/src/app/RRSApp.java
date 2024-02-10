package app;

import java.util.Scanner;

import entity.*;
import service.RRSservice;
import serviceimpl.RRSserviceimpl;


public class RRSApp {

	public static void main(String[] args) {
//		Address a=new Address("#012", "BTM", 560076);
//		Customer c=new Customer(123,"abc",95366015,a,0);
//		System.out.println(c);
		Scanner ip=new Scanner(System.in);
		RRSservice r=new RRSserviceimpl();
		System.out.println("==========Welcome To Room Rental System==========");
		while(true) {
			System.out.println("=======Menu=======");
			System.out.println("1.RoomInfo\n2.Rooms Availability");
			System.out.println("3.CheckIn\n4.CheckOut\n5.Exit");
			System.out.println("=======Enter your Option=======");
			int op=ip.nextInt();
			switch(op) {
			case 1: r.roomInfo(); break;
			case 2: r.checkAvailRoom(); break;
			case 3: r.checkIn(); break;
			case 4: r.checkOut(); break;
			case 5: System.out.println("Thank You,Visit Again..!!!");
				System.exit(0); break;
			default: System.out.println("Invalid Option!!!");
			}
		}
	}
}
