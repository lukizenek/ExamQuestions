
public class WheatField extends GrainField {
	private String WheatType;
	public double yieldPrSqMeterInKg() {
		double tY = 0;
		switch(WheatType) {
		case "common":
			tY = 8 * getSizeInSqMeters();
			return tY;
		case "spelt":
			tY = 7 * getSizeInSqMeters();
			return tY;
		}
		return tY;
			
	}

}
