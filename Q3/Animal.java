import java.util.ArrayList;
public abstract class Animal {
	private int numberOfLegs;
	
	public String toString() {
		return "Animal: "; //here eventually we would have all the atributes of an animal object
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Animal)) {
			return false;
		}
		Animal other = (Animal)obj; 
			return this.numberOfLegs == other.numberOfLegs;
		
	}
	
	

}
