//Driver program for the customer entity class
package Day2_oops;

public class Executor {
	

	public static void main(String[] args) {
	customer c1=new customer();
	c1.setcid(112);
	c1.setCname("sandy");
	c1.setAddress("puducherry");
	
	System.out.println("customer id:"+c1.getcid()+" customer name:"+c1.getCname()+"customer Address:"+c1.getAddress());
	}

}
