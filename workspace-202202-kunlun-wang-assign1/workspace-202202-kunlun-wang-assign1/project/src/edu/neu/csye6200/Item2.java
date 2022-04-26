package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Item2 implements Comparable<Item2>{
	private int id;
	private String name;
	private double price;
	
	public Item2() {
		super();
		System.out.println(this);
	}

	public Item2(int id, String name, double price) {
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
	public static int compareByName(Item2 a, Item2 b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
	public static int compareById(Item2 a, Item2 b) {
		return Integer.compare(a.getId(), b.getId());
	}	
	public static int compareByPrice(Item2 a, Item2 b) {
		return Double.compare(a.getPrice(), b.getPrice());
	}
	public static void demo() {
		System.out.println("\n\t" + Item2.class.getName() + ".demo()...");		
		
		Item2 bread = new Item2(1, "Bread", 1.23);
		Item2 eggs = new Item2(2, "Chicken", 5.12);
		Item2 chicken = new Item2 (3, "Beef", 6.91);
		
		List<Item2> items = new ArrayList<Item2>();
		
		items.add(bread);
		items.add(eggs);
		items.add(chicken);
		
		System.out.println("Sort by Name");
		items.sort(Item2::compareByName);
		items.forEach(System.out::println);
		
		System.out.println("Sort by Id");
		items.sort(Item2::compareById);
		items.forEach(System.out::println);
		
		System.out.println("Sort by Price");
		items.sort(Item2::compareByPrice);
		items.forEach(System.out::println);
	}

	@Override
	public int compareTo(Item2 o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
