//Driver program for the customer entity class
package Day2_oops;

public class Executor {
	

	public static void main(String[] args) {
	customer c1=new customer();
	c1.setcid(112);
	c1.setCname("sandy");
	c1.setAddress("puducherry");
	
	System.out.println("customer id:"+c1.getcid()+" customer name:"+c1.getCname()+"customer Address:"+c1.getAddress());
	
	customer c2=new customer();
	c2.setcid(112);
	c2.setCname("sandy");
	c2.setAddress("puducherry");
	System.out.println(c2);//calling the tostring method
	
	customer c3=new customer();//invoke explict defalut constructor
	System.out.println(c3);
	customer c4=new customer(114,"diviya","chennai");//invoke parameterized constructor
	System.out.print(c4);
	

	
	
	
	
}

}
