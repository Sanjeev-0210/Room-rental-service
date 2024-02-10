package service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;

public interface RRSservice {

	LinkedHashMap<Integer,Customer> ac=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> nonac=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> deluxe=new LinkedHashMap<Integer,Customer>();
	ArrayList<Customer> l1=new ArrayList<Customer>();
	
	void roomInfo();
	void checkAvailRoom();
	void checkIn();
	void checkOut();
	void allocate(LinkedHashMap<Integer, Customer> m,double camnt,String roomType,int roomno);
}
