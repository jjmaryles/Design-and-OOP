import Ex1.Animal;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Farm {
	private List<Animal> animals = new ArrayList<Animal>();
	public void addAnimals(Collection<? extends  Animal> newAnimals) {
		animals.addAll(newAnimals);
	}
}
