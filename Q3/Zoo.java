import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public Zoo(ZooKeeper zooKeeper) {
		zooKeeper = new ZooKeeper();
	}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	

}
