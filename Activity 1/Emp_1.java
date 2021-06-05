import java.util.*;
class Employee
{
      private String name,address,mobile;
      public void setname(String name)
      {
            this.name=name;
      }
      public void setaddress(String address)
      {
            this.address=address;
      }
      public void setmobile(String mobile)
      {
            this.mobile=mobile;    
      }
      public String getname()
      {
            return this.name;
      }
      public String getaddress()
      {
            return this.address;
      }
      public String getmobile()
      {
            return this.mobile;
      }      
}

public class EmployeeMain 
{
      public static void main(String[] args)
      {
            String name,address,mobile;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the name : ");
            name=sc.nextLine();
            System.out.println("Enter Address : ");
            address=sc.nextLine();
            System.out.println("Enter Mobile : ");
            mobile=sc.nextLine();
            Employee e=new Employee();
            e.setname(name);
            e.setaddress(address);
            e.setmobile(mobile);
            System.out.println("\nEmployee Details");
            System.out.println("Name : "+e.getname());
            System.out.println("Address : "+e.getaddress());
            System.out.println("Mobile : "+e.getmobile());
      }
}