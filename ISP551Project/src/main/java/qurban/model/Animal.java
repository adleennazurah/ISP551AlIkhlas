package qurban.model;

public class Animal {
	
	private int animalid;
	private String animalname;
	private int animalqty;
	private double animalprice;
	
	
	public Animal() {
		
	}
	//animal id set get
	public int getAnimalid() {
		return animalid;
	}
	public void setAnimalid(int animalid) {
		this.animalid = animalid;
	}
//animal name set get
	public String getAnimalname() {
		return animalname;
	}
	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}
	//animal qty set get
	public int getAnimalqty() {
		return animalqty;
	}
	public void setAnimalqty(int animalqty) {
		this.animalqty = animalqty;
	}
	//animal price set get
	public double getAnimalprice() {
		return animalprice;
	}
	public void setAnimalprice(double animalprice) {
		this.animalprice = animalprice;
	}
	
}
