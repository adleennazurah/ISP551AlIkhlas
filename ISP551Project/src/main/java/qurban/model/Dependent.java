package qurban.model;

public class Dependent {
	
	private int dependentid;
	private String dependentname;
	private int telephoneno;
	private int custid;
	
	public Dependent() {
		
	}
	public int getDependentid() {
		return dependentid;
	}
	public void setDependentid(int dependentid) {
		this.dependentid = dependentid;
	}

	
	
	public String getDependentname() {
		return dependentname;
	}
	public void setDependentname(String dependentname) {
		this.dependentname = dependentname;
	}
	public int getTelephoneno() {
		return telephoneno;
	}
	public void setTelephoneno(int telephoneno) {
		this.telephoneno = telephoneno;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}

}

