
public class Student extends Person{
	private int number;
	private int yearInCollage;
	
	public String adressedAsName() {
		switch(yearInCollage) {
		case 1:
			return "Freshman: " + super.getFirstname() + " " + super.getLastname();
		case 2:
			return "Sophomore: " + super.getFirstname() + " " + super.getLastname();
		case 3:
			return "Junior: " + super.getFirstname() + " " + super.getLastname();
		case 4:
			return "Senior: " + super.getFirstname() + " " + super.getLastname();
		default:
			return "error";
		}
		
	}

}
