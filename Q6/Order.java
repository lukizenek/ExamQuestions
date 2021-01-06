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
	public double totalPrice() {
		//some loop here utilizing array with all products in order and
		return 0;
	}

}
