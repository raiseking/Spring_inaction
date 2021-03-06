package com.cmbchina.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String name;
	private Address addr;
	private String[] books;
	private List<String> hobbies;
	private Map<String, String> cards;
	private Set<String> games;
	private String wife;
	private Properties info;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddr(Address address) {
		this.addr = address;
	}
	
	public void setBooks(String[] books) {
		this.books = books;
	}
	
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public void setCards(Map<String, String> cards) {
		this.cards = cards;
	}
	
	public void setGames(Set<String> games) {
		this.games = games;
	}
	
	public void setWife(String wife) {
		this.wife = wife;
	}
	
	public void setInfo(Properties info) {
		this.info = info;
	}
	
	public void show(){
		System.out.println("Name: "+name);
		System.out.println("Addr: "+addr.getAddress());
		System.out.print("Books: ");
		for(int i=0; i<books.length; i++)
		{
			System.out.print(books[i]+"  ");
		}
		System.out.println(); 
		System.out.println("hobbies: " + hobbies);
		System.out.println("Cards: " + cards);
		System.out.println("Games: " + games);
		System.out.println("Wife: " + wife);
		System.out.println("Info: " + info);
	}
}
