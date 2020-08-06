package com.arwizon.book;

public class Bookdata {
		private static int count=333;
		private int bookid;
		private String name;
		private String type;
		private String author;
		private int cost;
		public Bookdata()
		{
			count++;
		}
		public static int getCount() {
			return count;
		}
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
	/*	public int compareTo(Bookdata o) {
			if(this.getCount().compareTo(o.getCount())>0)
				return 1;
			else if()
			// TODO Auto-generated method stub
			return 0;
		}*/
		@Override
		public String toString() {
			return "Bookdata [bookid=" + bookid + ", name=" + name + ", type=" + type + ", author=" + author + ", cost="
					+ cost + "]";
		}
		public void add(Object pd1) {
			return 
			// TODO Auto-generated method stub
			
		}
		

	}

