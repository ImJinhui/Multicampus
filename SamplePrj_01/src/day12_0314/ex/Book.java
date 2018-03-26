package day12_0314.ex;

import java.util.Arrays;

import day12_0314.Employee;

public class Book implements Comparable<Book>{
	
	private String title; 
	private int price;
	
	public Book() {
		super();
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "제목 : " + title + " 가격  : " + price ;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Book)){
			return false;
		}
		Book target = (Book)obj;
		
		if(this.title.equals(target.title) && this.price == target.price){
			return true;
		}

		return false;
	}

	@Override
	public int compareTo(Book o) {
		
		return 0;
	}

	public void print(){
		
	}
	


}
