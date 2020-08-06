package com.arwizon.book.imp;

import java.util.Set;

import com.arwizon.book.Bookdata;

public interface BookInterface {
	public void addProduct(String name, String type,String author,int price);

	public Set<Bookdata>displayProduct();
	public Set<Bookdata> searchProduct(String name);

}
