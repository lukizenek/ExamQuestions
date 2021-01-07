import java.util.Date;
public class CreditcardAccount extends Account{
	private double creditLimit;
	private CreditCard creditCard;
	

	public void deposit(double amount, Date depositedDate) {
		 if(amount >= (creditLimit*(-1))) {
			 new Deposit(amount, depositedDate);
		 }
	}
	public CreditCard getCreditCard() {
		return this.creditCard.copy();
	}
}
