package qurban.model;

public class Customer {
	
	private int custid;
	private String custname;
	private String custemail;
	private String custaddress;
	private int custnumber;
	private int id;
	
	
	public Customer() {
		
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	
	public int getCustnumber() {
		return custnumber;
	}
	public void setCustnumber(int custnumber) {
		this.custnumber = custnumber;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}

