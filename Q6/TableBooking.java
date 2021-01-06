import java.util.Date;
public class TableBooking extends Order{
	private final double SERVICE_FEE = 10;
	private Date tableWanted;
	
	public double totalPrice() {
		return super.totalPrice() + SERVICE_FEE;
	}

}
