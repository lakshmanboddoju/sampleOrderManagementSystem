package assessment1;

import java.util.ArrayList;

public class Customer {

	private int customerID;
	private String customerName;
	private int customerAge;
	private ArrayList<Order> custOrders;
	
	public Customer(int customerID, String customerName, int customerAge)
	{
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAge = customerAge;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public ArrayList<Order> getCustOrders() {
		return custOrders;
	}

	public void setCustOrders(ArrayList<Order> custOrders) {
		this.custOrders = custOrders;
	}
	
}
