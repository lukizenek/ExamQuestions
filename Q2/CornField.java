
public class CornField extends GrainField{
	public double yieldPrSqMeterInKg() {
		return getSizeInSqMeters() * 10;
	}

}
