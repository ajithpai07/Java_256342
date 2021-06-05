import java.util.*;
class Employee {
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
		 System.out.println("Name: " + getName());
		 System.out.println("Address: " + getAddress());
		 System.out.println("Mobile: " + getMobile());	
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name:");
		String Name = sc.nextLine();
		emp.setName(Name);
		System.out.println("Enter Address:");
		String address = sc.nextLine();
		emp.setAddress(address);
		System.out.println("Enter Mobile:");
		String mobile = sc.nextLine();
		emp.setMobile(mobile);
		System.out.println("\nEmployee Details");
		emp.displayDetails();
	    sc.close();
	}

}