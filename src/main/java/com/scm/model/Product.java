package com.scm.model;

public class Product {

	private int ProductID;
	private String ProductName;
	private String ProductDisc;;
	private int ProductPrice;

//	public Product() {
//
//	}

	public Product(int productID, String productName, String productDisc, int productPrice) {
		super();
		ProductID = productID;
		ProductName = productName;
		ProductDisc = productDisc;
		ProductPrice = productPrice;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDisc() {
		return ProductDisc;
	}

	public void setProductDisc(String productDisc) {
		ProductDisc = productDisc;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", ProductName=" + ProductName + ", ProductDisc=" + ProductDisc
				+ ", ProductPrice=" + ProductPrice + "]";
	}

}
