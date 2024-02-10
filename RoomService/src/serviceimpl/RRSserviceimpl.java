package serviceimpl;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import entity.Address;
import entity.Customer;
import service.RRSservice;

public class RRSserviceimpl implements RRSservice{
	Scanner ip=new Scanner(System.in);

	{
		for(int i=101;i<=108;i++) {
			ac.put(i, null);
			nonac.put(i, null);
			deluxe.put(i, null);
		}
	}

	@Override
	public void roomInfo() {
		System.out.println("===========Room Details===========");
		System.out.println("1.AC\n2.Non-AC\n3.Deluxe");
		System.out.println("Enter your option:");
		int op=ip.nextInt();
		switch(op) {
		case 1: System.out.println("=====AC Room=====");
		System.out.println("1.AC\t2.TV\t3.WIFI\t4.Fridge");
		System.out.println("Price:2500/Day"); break;
		case 2: System.out.println("=====Non-AC Room=====");
		System.out.println("1.TV\t2.WIFI\t3.Fridge");
		System.out.println("Price:1500/Day"); break;
		case 3: System.out.println("=====Deluxe Room=====");
		System.out.println("1.AC\t2.TV\t3.WIFI\t4.Fridge");
		System.out.println("Price:2000/Day"); break;
		default: System.out.println("Invalid Option!!!");
		}

	}

	@Override
	public void checkAvailRoom() {
		System.out.println("1.AC\n2.Non-AC\n3.Deluxe");
		System.out.println("Enter your option:");
		int op=ip.nextInt();
		switch(op) {
		case 1:
		System.out.println("======AC Room======");
		int c=0;
		for(int key:ac.keySet()) {
			if(ac.get(key)==null) {
				System.out.print(key+" ");
				c++;
			}
		}
		System.out.println();
		if(c==0) {
			System.out.println("All room are Occupied!!!");
		} break;
		case 2:
		//non-ac
		System.out.println("======Non-AC Room======");
		int c1=0;
		for(int key:nonac.keySet()) {
			if(nonac.get(key)==null) {
				System.out.print(key+" ");
				c1++;
			}
		}
		System.out.println();
		if(c1==0) {
			System.out.println("All room are Occupied!!!");
		} break;
		case 3:
		//deluxe
		System.out.println("======Deluxe Room======");
		int c2=0;
		for(int key:deluxe.keySet()) {
			if(deluxe.get(key)==null) {
				System.out.print(key+" ");
				c2++;
			}
		}
		System.out.println();
		if(c2==0) {
			System.out.println("All room are Occupied!!!"); 
		} break;
		default: System.out.println("Invalid Option!!!");
	}
		
	}
	
	@Override
	public void checkIn() {
		System.out.println("============Check-In=============");
		System.out.println("=======Rooms Details=======");
		System.out.println("1.AC\n2.Non-AC\n3.Deluxe");
		System.out.println("Enter your option:");
		int op=ip.nextInt();
		System.out.println("Please Enter the Room number:");
		int roomno=ip.nextInt();
		switch(op) {
		case 1: if(ac.containsKey(roomno)&&ac.get(roomno)==null) {
//				ac.put(roomno, new Customer(roomno, null, roomno, null, roomno, null));
			allocate(ac, 2500, "AC", roomno);
//				System.out.println("Allocated..!!!"); 
				}
				else {
					System.out.println("Invalid Room no Or Room is not available..!!"); 
				}break;
		case 2: if(nonac.containsKey(roomno)&&nonac.get(roomno)==null) {
//			
		allocate(nonac, 2500, "Non-AC", roomno);
//			System.out.println("Allocated..!!!"); 
			}
			else {
				System.out.println("Invalid Room no Or Room is not available..!!"); 
			} break;
		case 3: if(deluxe.containsKey(roomno)&&deluxe.get(roomno)==null) {
					allocate(deluxe, 2500, "Deluxe", roomno);
//			System.out.println("Allocated..!!!"); 
			}
			else {
				System.out.println("Invalid Room no Or Room is not available..!!"); 
			}break;
		default: System.out.println("Invalid Option!!!");
		}
	}

	@Override
	public void allocate(LinkedHashMap<Integer, Customer> m,double camnt,String roomType,int roomno) {
		System.out.println("============Customer Details============");
		System.out.println("Please Enter Customer ID:");
		int cid=ip.nextInt();
		System.out.println("Please Enter Customer Name:");
		String cname=ip.next();
		System.out.println("Please Enter Customer Phno:");
		long cphno=ip.nextLong();
		System.out.println("Please Enter Customer House no:");
		String houseno=ip.next();
		System.out.println("Please Enter Customer Street Name:");
		String streetname=ip.next();
		System.out.println("Please Enter Customer Pincode:");
		int pin=ip.nextInt();
		
		Address a=new Address(houseno, streetname, pin);
		Customer c=new Customer(cid, cname, cphno, a, camnt, roomType);
		l1.add(c);
		m.put(roomno, c);
		System.out.println(c.getCname()+" had allocate for "+roomType+" roomno "+roomno);
		System.out.println("Amount need to be paid:"+camnt);
	}

	@Override
	public void checkOut() {
		System.out.println("============Check-In=============");
		System.out.println("=======Rooms Details=======");
		System.out.println("1.AC\n2.Non-AC\n3.Deluxe");
		System.out.println("Enter your option:");
		int op=ip.nextInt();
		System.out.println("Please Enter the Room number:");
		int roomno=ip.nextInt();
		System.out.println("Please Enter Customer id:");
		int cid=ip.nextInt();
		switch(op) {
		case 1: if(ac.containsKey(roomno)&&ac.get(roomno)!=null&&ac.get(roomno).getCid()==cid) {
				System.out.println(ac.get(roomno).getCname()+" thanks for visiting!!!");
				ac.put(roomno, null);
				}
				else {
					System.out.println("Invalid Credentials..!!"); 
				}break;
		case 2: if(nonac.containsKey(roomno)&&nonac.get(roomno)!=null&&nonac.get(roomno).getCid()==cid) {
			System.out.println(nonac.get(roomno).getCname()+" thanks for visiting!!!");
			nonac.put(roomno, null);
			}
			else {
				System.out.println("Invalid Credentials..!!");}break;
		case 3: if(deluxe.containsKey(roomno)&&deluxe.get(roomno)!=null&&deluxe.get(roomno).getCid()==cid) {
			System.out.println(deluxe.get(roomno).getCname()+" thanks for visiting!!!");
			deluxe.put(roomno, null);
			}
			else {
				System.out.println("Invalid Credentials..!!");}break;
		default: System.out.println("Invalid Option!!!");
	}

	}
}
