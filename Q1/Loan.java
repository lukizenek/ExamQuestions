import java.util.Date;
public class Loan extends Account{

	private double initialAmount;
	
	public void deposit(double amount, Date depositedDate) {
		if(amount > 0) {
			initialAmount += amount;
		}
		else {
			System.out.println("You cannot withdraw from the loan");
		}
	}
}
