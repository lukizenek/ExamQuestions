import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public Zoo(ZooKeeper zooKeeper) {
		zooKeeper = new ZooKeeper();
	}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	public void removeAnimal(int index) {
		animals.remove(index);
	}
	public Animal getAnimal(int index) {
		return animals.get(index);
	}
	public int totalNumberOfLegs(int index) {
		return animals.get(index).getnumberOfLegs();
	}
	public ArrayList<Mammal> allFurryMammals(){
		ArrayList<Mammal> furryMammals = new ArrayList<Mammal>();
		for(int i = 0 ; i < animals.size() ; i++)
		{
			if(animals.get(i) instanceof Mammal)
			{
				Mammal mammal = (Mammal)animals.get(i);
				if(mammal.hasFur())
					furryMammals.add(mammal);
			}
		}
		return furryMammals;
	}
}
