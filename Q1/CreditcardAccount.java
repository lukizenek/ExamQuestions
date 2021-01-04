import java.util.Date;
public class CreditcardAccount extends Account{
	private double creditLimit;
	private CreditCard creditCard;
	

	public void deposit(double amount, Date depositedDate) {
		this.deposit(amount, depositedDate);
	}
	public CreditCard getCreditCard() {
		creditCard = creditCard.copy();
		return creditCard;
	}
}
