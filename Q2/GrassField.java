
public class GrassField extends Field {
	private int harvestsPrYear;
	private double kgPrHarvestPrSqMeter;
	
	public GrassField(int hPY, double kPHPSM) {
		this.harvestsPrYear = hPY;
		this.kgPrHarvestPrSqMeter = kPHPSM;
	}
	
	public int getharvestPrYear() {
		return harvestsPrYear;
	}
	public double getkgPrHarvestPrSqMeter() {
		return kgPrHarvestPrSqMeter;
	}

}
