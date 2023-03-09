package AssignmentTwo.QuestionFive;

import java.util.ArrayList;
import java.util.List;

public class Dog {
	private String breed;
	private String name;
	private List<Paw> paws;
	
	public Dog() {
		this.breed = "";
		this.name = "";
		
		paws = new ArrayList<Paw>();
		paws.add(new Paw(0));
		paws.add(new Paw(1));
		paws.add(new Paw(2));
		paws.add(new Paw(3));
	}
}
