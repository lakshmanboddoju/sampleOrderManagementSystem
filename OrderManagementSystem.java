package assessment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderManagementSystem {

	private ArrayList<Customer> customers;

	public OrderManagementSystem(ArrayList<Customer> customers) {
		super();
		this.customers = customers;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	public ArrayList<Order> getOnlineOrders(int customerID) throws CustomerDoesNotExistException {
		boolean isFound = false;
		ArrayList<Order> toReturnList = new ArrayList<Order>();
		for (Customer c:customers) {
			if (c.getCustomerID() == customerID) {
				isFound = true;
				for (Order o:c.getCustOrders()) {
					if (o instanceof OnlineOrder) {
						toReturnList.add(o);
					}
				}
			}
		}
		
		if (isFound == false) {
			throw new CustomerDoesNotExistException();
		}
		else {
			return toReturnList;
		}
	}
	
	public Map<Integer, ArrayList<Order>> getAllOrdersByCustomerID() {
		Map<Integer, ArrayList<Order>> toReturnMap = new HashMap<Integer, ArrayList<Order>>();
		for (Customer c:customers) {
			toReturnMap.put(c.getCustomerID(), c.getCustOrders());
		}
		return toReturnMap;
	}
	
	public Map<String, ArrayList<Order>> getAllOrdersByDate() {
		ArrayList<Order> currentValues = new ArrayList<Order>();
		Map<String, ArrayList<Order>> toReturnMap = new HashMap<String, ArrayList<Order>>();
		for (Customer c:customers) {
			for(Order o:c.getCustOrders()) {
				if(toReturnMap.containsKey(o.getOrderDate())) {
					currentValues = toReturnMap.get(o.getOrderDate());
					currentValues.add(o);
					toReturnMap.put(o.getOrderDate(), currentValues);
				}
				else {
					//ifFound = true;
					currentValues.add(o);
					toReturnMap.put(o.getOrderDate(), currentValues);
				}
			}
		}
		return toReturnMap;
	}
	
}
