package assessment1;

public abstract class Order {

	private int orderID;
	private double orderCost;
	private String orderDate;
	
	public Order(int orderID, double orderCost, String orderDate)
	{
		super();
		this.orderID = orderID;
		this.orderCost = orderCost;
		this.orderDate = orderDate;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public abstract double finalOrderCost();
}
