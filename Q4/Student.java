
public class Student extends Person{
	private int number;
	private int yearInCollage;
	
	public String adressedAsName() {
		switch(yearInCollage) {
		case 1:
			return "Freshman: " + getFirstname() + " " + getLastname();
		case 2:
			return "Sophomore: " + getFirstname() + " " + getLastname();
		case 3:
			return "Junior: " + getFirstname() + " " + getLastname();
		case 4:
			return "Senior: " + getFirstname() + " " + getLastname();
		default:
			return "error";
		}
		
	}

}
