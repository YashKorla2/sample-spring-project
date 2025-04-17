package com.mylab.cromero.dto;
/**
* <h1>BaseRequest</h1>
* BaseRequest dto request 
* <p>
* <b>BaseRequest</b> BaseRequest data transfer object 
* for sevice layer
*
* @author  Cristian Romero Matesanz
*
* 
*/
public class PizzaResponse {

	private String name;
	
	private Float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PizzaResponse [name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	

}
