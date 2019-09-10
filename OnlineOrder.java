package assessment1;

public class OnlineOrder extends Order{

	private double deliveryCharge;

	public OnlineOrder(int orderID, double orderCost, String orderDate, double deliveryCharge) {
		super(orderID, orderCost, orderDate);
		// TODO Auto-generated constructor stub
		this.deliveryCharge = deliveryCharge;
	}

	public double getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	@Override
	public double finalOrderCost(){
		// TODO Auto-generated method stub
		return (this.getOrderCost()+this.getDeliveryCharge());
	}
	
}
