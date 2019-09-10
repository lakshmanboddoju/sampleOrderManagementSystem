package assessment1;

import java.util.ArrayList;

public class Tester {
	
	public static void main(String[] args)
	{
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Order> orderList1 = new ArrayList<Order>();
		ArrayList<Order> orderList2 = new ArrayList<Order>();
		ArrayList<Order> orderList3 = new ArrayList<Order>();
		System.out.println("Hi\n");
		int initCustomerID = 100;
		
		Order onlineOrder1 = new OnlineOrder(1, 10, "Jul-2", 1);
		Order onlineOrder2 = new OnlineOrder(2, 20, "Jul-3", 2);
		Order onlineOrder3 = new OnlineOrder(3, 30, "Jul-4", 3);
		Order onlineOrder4 = new OnlineOrder(4, 40, "Jul-5", 4);
		Order onlineOrder5 = new OnlineOrder(5, 50, "Jul-6", 5);
		Order onlineOrder6 = new OnlineOrder(6, 60, "Jul-7", 6);
		Order inStoreOrder1 = new InStoreOrder(6, 60, "Jul-2", "Jishnu");
		Order inStoreOrder2 = new InStoreOrder(7, 70, "Jul-3", "Pradeep");
		Order inStoreOrder3 = new InStoreOrder(8, 80, "Jul-4", "Harsh");
		Order inStoreOrder4 = new InStoreOrder(9, 90, "Jul-5", "Shreya");
		Order inStoreOrder5 = new InStoreOrder(10, 100, "Jul-6", "Pooja");
		Order inStoreOrder6 = new InStoreOrder(11, 110, "Jul-7", "Chandra");
		
		Customer customer1 = new Customer(initCustomerID++, "Lakshman", 23);
		Customer customer2 = new Customer(initCustomerID++, "Pavan", 24);
		Customer customer3 = new Customer(initCustomerID++, "Kumar", 25);
		
		orderList1.add(onlineOrder1);
		orderList1.add(inStoreOrder1);
		
		orderList2.add(onlineOrder2);
		orderList2.add(inStoreOrder2);
		
		orderList3.add(onlineOrder3);
		orderList3.add(inStoreOrder3);
		
		customer1.setCustOrders(orderList1);
		customer2.setCustOrders(orderList2);
		customer3.setCustOrders(orderList3);
		
		customerList.add(customer1);	
		customerList.add(customer2);	
		customerList.add(customer3);	
		
		OrderManagementSystem OMS = new OrderManagementSystem(customerList);
		
		//System.out.println(OMS.getAllOrdersByCustomerID());
		//System.out.println(OMS.getAllOrdersByDate());
		
		for (int key:OMS.getAllOrdersByCustomerID().keySet()) {
			//System.out.println(OMS.getAllOrdersByCustomerID().get(key));
			for (Order o:OMS.getAllOrdersByCustomerID().get(key)) {
				System.out.println(o.getOrderID());
			}
		}
		
		for (String key:OMS.getAllOrdersByDate().keySet()) {
			System.out.println(OMS.getAllOrdersByDate().get(key));
		}
		
		try {
			System.out.println(OMS.getOnlineOrders(101));
		} catch (CustomerDoesNotExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
