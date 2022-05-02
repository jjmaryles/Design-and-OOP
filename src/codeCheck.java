import Ex1.Bear;
import Ex1.Caribou;
import ex05.Program;

import java.awt.*;
import java.util.*;
import java.util.List;

public class codeCheck {
	
	
	public static void main(String args[]) {
		List<Bear> cats = new ArrayList<Bear>();
		List<Caribou> dogs = new ArrayList<Caribou>();
		Farm farm = new Farm();
		farm.addAnimals(cats); // Compilation error
		farm.addAnimals(dogs); // Compilation error
		
		
		
	}
}
