package com.GaddaServlets;

import java.lang.ProcessHandle.Info;

public class SettersGetters {
	private String Product_Id;
	private String Name;
	private String Brand;
	private String Category;
	private int Price;
	
	public SettersGetters(String Product_ID, String name, String Brand, String Category, int Price) {
		super();
		Product_Id = Product_ID;
		Name = name;
		Brand = Brand;
		Category = Category;
		Price = Price;
	}
	public String getProduct_Id() {
		return Product_Id;
	}
	public void setId(String Product_ID) {
		Product_Id = Product_ID;
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
	public void setBrand(String Brand) {
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
	public void setPrice(int Price) {
		this.Price = Price;
	}
	@Override
	public String toString() {
		return "SettersGetters [Product_Id=" + Product_Id + ", Name=" + Name + ", Brand =" + Brand + ", Category=" + Category + ", Price="+ Price + "]";
	}
	
	
	
}
