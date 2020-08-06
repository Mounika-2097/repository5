package com.arwizon.book.Util;



public class Utilities {
	public static void example(String name) throws MyException {
		String pattern = "[A-Za-z]+";
		if (!name.matches(pattern)) {
			throw new MyException("Name can only be alphabets");
		}
	}
		public static void example1(String type) throws MyException {
		String pattern = "[A-Za-z]+";
		if (!type.matches(pattern)) {
			throw new MyException("type is in alphabets");
		}
		}
		public static void example2(String author)throws MyException {
			String pattern = "[A-Za-z]+";
			if (!author.matches(pattern)) {
				throw new MyException("type is in alphabets");
		}
		}
}
		
		
