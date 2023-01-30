package com.bitlabs.ProductInfo;

public interface Dao {

	public void insert(ProductInfo p);
	public void searchById(int id);
	public void viewAll();
}
