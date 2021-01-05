import java.util.Date;
public abstract class Order {
	private int id = lastOrderId + 1;
	private static int lastOrderId;
	private Date orderPlaced;
	
	public Order() {
		
	}

	public int getId() {
		return id;
	}

	public Date getOrderPlaced() {
		return orderPlaced;
	}
	public abstract double totalPrice();

}
