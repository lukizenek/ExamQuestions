
public class WheatField extends GrainField {
	private String WheatType;
	public double yieldPrSqMeterInKg() {
		double tY = 0;
		switch(WheatType) {
		case "common":
			tY = 8 * getSizeInSqMeters();
			break;
		case "spelt":
			tY = 7 * getSizeInSqMeters();
			break;
		default:
			System.out.print("Error");
		}
		return tY;
			
	}

}
