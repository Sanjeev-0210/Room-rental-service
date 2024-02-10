package entity;

public class Address {

	private String houseno;
	private String StreetName;
	private int pincode;
	public Address(String houseno, String streetName, int pincode) {
		super();
		this.houseno = houseno;
		StreetName = streetName;
		this.pincode = pincode;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", StreetName=" + StreetName + ", pincode=" + pincode + "]";
	}
	
	
}
