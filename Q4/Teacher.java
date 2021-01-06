
public class Teacher extends Person{
	private String academicTitle;
	
	public String adressedAsName() {
		return academicTitle + getLastname();
	}

}
