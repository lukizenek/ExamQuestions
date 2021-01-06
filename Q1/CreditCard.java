import java.util.Date;
public class CreditCard {
	private String number;
	private Date validTo;
	
	public CreditCard(String number, Date validTo) {
		this.number = number;
		this.validTo = validTo;
	}
	
	public CreditCard copy() {
		return new CreditCard(this.number, this.validTo);
	}
	

}
