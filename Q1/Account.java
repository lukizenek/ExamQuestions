import java.util.Date;
import java.util.ArrayList;
public abstract class Account {
private String accountNumber;
private ArrayList<Deposit> deposits = new ArrayList<Deposit>(); 

public abstract void deposit(double amount, Date depositedDate);

public double calculateBalance() {
	double balance = 0;
	for(int i = 0; i < deposits.size(); i++) {
		balance += deposits.get(i).getAmount();
	}
	return balance;
}
public int numberOfDeposits() {
	return deposits.size();
}

}
