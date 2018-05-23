package com.corejava.inheritance;

public class PaperBook extends Book{
	int shippingWeight;
	boolean inStock;
	public int getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(int shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	//over loading
	public int add(int a, int b){
		return a+b;
	}
	
	public int add(int a, int b, int c){
		return a+b+c;
	}
	
	

}
