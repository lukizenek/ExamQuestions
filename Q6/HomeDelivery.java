import java.util.Date;
public class HomeDelivery extends Order {
	private String address;
	private double distanceToRestaurant;
	private Date deliveryWanted;
	
	public double totalPrice() {
		double dFee = 0;
		if(distanceToRestaurant > 0 && distanceToRestaurant <= 5) {
			dFee = 5;
		}
		else if(distanceToRestaurant > 5 && distanceToRestaurant <= 10) {
			dFee = 12;
		}
		else if(distanceToRestaurant > 10) {
			dFee = 25;
		}
		return super.totalPrice() + dFee;
	}

}
