import java.util.ArrayList;
public abstract class Animal {
	private int numberOfLegs;
	
	public String toString() {
		return "Animal: " + numberOfLegs; //here eventually we would have all the atributes of an animal object
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Animal)) {
			return false;
		}
			return this == obj;
		
	}
	
	

}
