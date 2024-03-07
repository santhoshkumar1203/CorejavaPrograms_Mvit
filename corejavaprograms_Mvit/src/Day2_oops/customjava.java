//program to demonstrate the customer entity
package Day2_oops;

public class customjava {
	private int cid;
	private String cname;
	private String address;
	
	//getter and setter
	public void setcid(int cid)
	{
		this.cid=cid;
		
	}
	
	public int getcid() {
		return cid;
	}
       	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
