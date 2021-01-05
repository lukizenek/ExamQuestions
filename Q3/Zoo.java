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
	

}
