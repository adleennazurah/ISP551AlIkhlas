package qurban.model;

public class Order {
	private int orderId;
	private int custId;
	private String animalId;
	private String orderPart;
	private String orderDate;
	
	public Order() {
		
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getAnimalId() {
		return animalId;
	}
	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}
	public String getOrderPart() {
		return orderPart;
	}
	public void setOrderPart(String orderPart) {
		this.orderPart = orderPart;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
}
