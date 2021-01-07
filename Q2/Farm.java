import java.util.ArrayList;

public class Farm {
	private ArrayList<Field> fields = new ArrayList<Field>();
	public void addField(Field field) {
		fields.add(field);
	}
	public int numberOfFields() {
		return fields.size();
	}
	public int totalSize() {
		int tSize = 0;
		for(int i = 0; i < fields.size(); i++) {
			tSize += fields.get(i).getSizeInSqMeters();
		}
		return tSize;
	}
	public double totalGrassYield() {
		  fields.get(0).
	}

}
