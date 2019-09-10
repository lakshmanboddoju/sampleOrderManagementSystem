package assessment1;

public class InStoreOrder extends Order{

	private String salesPerson;
	
	public InStoreOrder(int orderID, double orderCost, String orderDate, String salesPerson) {
		super(orderID, orderCost, orderDate);
		// TODO Auto-generated constructor stub
		this.salesPerson = salesPerson;
	}

	@Override
	public double finalOrderCost() {
		// TODO Auto-generated method stub
		return this.getOrderCost();
	}
	
}
