package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Item implements Comparable<Item>{
	private int id;
	private String name;
	private double price;

	
	public Item() {
		super();
		System.out.println(this);
	}

	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\t[Item:" + id + ", name:" + name + ", price:" + price + "]";
	}
	public static int compareByName(Item a, Item b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
	public static int compareById(Item a, Item b) {
		return Integer.compare(a.getId(), b.getId());
	}	
	public static int compareByPrice(Item a, Item b) {
		return Double.compare(a.getPrice(), b.getPrice());
	}
	public static void demo() {
		System.out.println("\n\t" + Item.class.getName() + ".demo()...");		
		
		Item bread = new Item(1, "Bread", 1.23);
		Item eggs = new Item(2, "Chicken", 5.12);
		Item chicken = new Item (3, "Beef", 6.91);
		
		List<Item> items = new ArrayList<Item>();
		
		items.add(bread);
		items.add(eggs);
		items.add(chicken);
		
		System.out.println("Sort by Name");
		items.sort(Item::compareByName);
		items.forEach(System.out::println);
		
		System.out.println("Sort by Id");
		items.sort(Item::compareById);
		items.forEach(System.out::println);
		
		System.out.println("Sort by Price");
		items.sort(Item::compareByPrice);
		items.forEach(System.out::println);
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
