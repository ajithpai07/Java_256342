import java.util.*;
class Customer {
	  private String name;
	  private String address;
	  private String mobile;

	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getMobile() {
		return mobile;
	}


	public  void displayDetails() {
		System.out.println("\nCustomer Details");
		 System.out.println("\nName: "+getName());
		 System.out.println("Address: "+getAddress());
		 System.out.println("Mobile: "+getMobile());
	}
}

public class CustomerMain {
	public static void main(String[] args) {
		Customer cust = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String s = sc.nextLine();
		String arr[]= s.split(",");
		cust.setName(arr[0]);
		cust.setAddress(arr[1]);
		cust.setMobile(arr[2]);
		cust.displayDetails();
		sc.close();
	}
}