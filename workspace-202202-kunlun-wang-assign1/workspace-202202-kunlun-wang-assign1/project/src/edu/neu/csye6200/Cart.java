package edu.neu.csye6200;

public class Cart {
	public final static int MAJOR_VERSION = 1;
	public final static int MINOR_VERSION = 0;
	public final static String VERSION = Integer.valueOf(MAJOR_VERSION).toString()
				+"."
				+ Integer.valueOf(MINOR_VERSION);
	private double myCash;
	private double myTotal;
	private double myChange;
	{
		this.myCash = 20.00;
		this.myTotal = 0;
		this.myChange = 0;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(double myCash, double myTotal, double myChange) {
		super();
		this.myCash = myCash;
		this.myTotal = myTotal;
		this.myChange = myChange;
	}
	public double getMyCash() {
		return myCash;
	}
	public void setMyCash(double myCash) {
		this.myCash = myCash;
	}
	public double getMyTotal() {
		return myTotal;
	}
	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}
	public double getMyChange() {
		return myChange;
	}
	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}
	@Override
	public String toString() {
		StringBuilder sb =new StringBuilder();
		
		sb.append("\n[version ").append(VERSION).append("]: ");
		sb.append("\ncheckout:");
		sb.append("\n\tCash ").append(this.myCash);
		sb.append("\n\tTotal ").append(this.myTotal);
		sb.append("\n\tChange ").append(this.myChange);
		
		return sb.toString();
		//return "Cart [myCash=" + myCash + ", myTotal=" + myTotal + ", myChange=" + myChange + "]";
	}
	
	public void sillyCheckout(double cash, double price, double total, double change) {
		total = total + price;
		change = cash - total;
	}
	public double checkout(Cart myCart, Item myItem) {
		myCart.setMyTotal(myCart.getMyTotal()+myItem.getPrice());
		myCart.setMyChange(myCart.getMyCash()-myCart.getMyTotal());	
		
		return myCart.getMyChange();
		
	}
	

}
