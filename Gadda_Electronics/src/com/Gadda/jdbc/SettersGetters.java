package com.Gadda.jdbc;

public class SettersGetters {
	private String Product_ID;
	private String Name;
	private String Brand;
	private String Category;
	private String Price;
	
	public SettersGetters(String id, String name, String Brand, String Category, String Price) {
		super();
		Product_ID = Product_ID;
		Name = name;
		Brand = Brand;
		Category = Category;
		Price = Price;
	}

	public String getProduct_ID() {
		return Product_ID();
	}

	public void setProduct_ID(String Product_ID) {
		Product_ID = Product_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBrand() {
		return Brand;
	}

	public void setGender(String Brand) {
		Brand = Brand;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String Category) {
		Category = Category;
	}

	public int getPrice() {
		return Price;
	}

	public void setPhone(String Price) {
		Price = Price;
	}

	@Override
	public String toString() {
		return "SettersGetters [Product_Id=" + Product_ID + ", Name=" + Name + ", Brand=" + Brand + ", Category=" + Category + ", Price="
				+ Price + "]";
	}
	
	
	

}
