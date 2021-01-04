import java.util.Date;
public class Deposit {
private double amount;
private Date depositedDate;
public Deposit(double amount, Date depositedDate) {
	this.amount = amount;
	this.depositedDate = depositedDate;
}
public double getAmount() {
	return amount;
}
public Date getDepositedDate() {
	return depositedDate;
}

}
