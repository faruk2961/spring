package cct.ie.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animals {

	@Id
	private int aid;
	private String type;
	private int  weight;
	private int price;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Animals [aid=" + aid + ", type=" + type + ", weight=" + weight + ", price=" + price + "]";
	}
	 //public double calculate() {
		//double  amount=0;
	//	 for(int i=0; i < weight.length;i++) {
		//	int weights =  weight[i];
			
		//	if(weights>10) {
		//		System.out.println("satilir");
		//	}else {
		//		System.out.println("satilamaz");
				
		//	}
		// }
	//	return amount;
	// }
	
	
	
	
}
