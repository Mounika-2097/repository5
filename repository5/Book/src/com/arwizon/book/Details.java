package com.arwizon.book;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.arwizon.book.Util.MyException;
import com.arwizon.book.Util.Utilities;
import com.arwizon.book.imp.BookInterface;
import com.arwizon.book.imp.BookInterfaceimple;
import com.arwizon.book.Util.ConnectionClass;




public class Details
{
	public static void main(String[] args) throws MyException {
		ConnectionClass.Connectiondb();
		System.out.println("Press 1 to add  "+"\n 2. to display "+"3.\n to search"+"4.\n to update press"+"6 to exit");
			Scanner s = new Scanner(System.in);
			Set<Bookdata> B = new HashSet<Bookdata>();
			while (true) {
				System.out.println("Choose your option");
				int option = s.nextInt();
				switch (option) {
				case 1:
					String name = null;
					while (true) {
						System.out.println("Enter product name");
						name = s.next();
						try {
							Utilities.example(name);
							break;
						} 
						catch (MyException e) {
							System.out.println(e.getMessage());
						}
					}
					String type=null;
					while (true) {
						System.out.println("Enter type");
						type=s.next();
						try {
							Utilities.example1(type);
							break;
						} catch (MyException e) {
							System.out.println(e.getMessage());
						}

					}
					String author=null;
					while (true) {
						System.out.println("Enter author");
						author=s.next();
						try {
							Utilities.example2(author);
							break;
						} 
						catch (MyException e) {
							System.out.println(e.getMessage());
						}
					}
					String price1=null;
					while (true) {
						System.out.println("Enter price");
						author=s.next();
						try {
							Utilities.example2(author);
							break;
						} 
						catch (MyException e) {
							System.out.println(e.getMessage());
						}
					}
					int price = Integer.parseInt(price1);
						BookInterface bi = new BookInterfaceimple();
						bi.addProduct(name,type,author, price);
						System.out.println("Product added successfully!");
						break;
			}
			}
			case 2:
				BookInterface bi2= new BookInterfaceimple();
				//ServiceInterface si1 = new ServiceInterfaceImp();
				Set<Bookdata> m1=bi2.displayProduct();
				for ( p : m1) {
					System.out.println(p);
				}
				break;
			case 3:
				System.out.println("Enter product name to search");
				String pname = s.next();
				BookInterface bi2= new BookInterfaceimple();
				
			Set<Bookdata> product = bi2.searchProduct(author);
				if (product.size()==0) {
					System.out.println("Product not found");
				} else {
					//System.out.println(product);
					for (Bookdata p :product) {
						System.out.println(p);
					}
							
				}
			case 4:
				System.exit(1);
				break;
			default:
				System.out.println("Please enter the valid option");
	}
}
