
public class Mammal extends Vertebrate {
	private double furLength;
	
	public boolean givesLiveBirth() {
		return true;
		
	}
	public double getFurLength() {
		return this.furLength;
	}
	public boolean hasFur() {
		if(furLength > 0) {
			System.out.println("This animal fur has length of: " + furLength);
			return true;
		}
		else if(furLength == 0) {
			System.out.println("This animal does not have fur.");
			return false;
		}
		return false;
	}
	

}
