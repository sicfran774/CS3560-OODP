package AssignmentTwo.QuestionFive;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String name;
	private String genre;
	private List<Watch> listWatch;
	
	public Movie(String name, String genre, List<Watch> listWatch) {
		this.name = name;
		this.genre = genre;
		this.listWatch = listWatch;
	}
	
	public void addWatch(Watch watch) {
		if(listWatch == null) {
			listWatch = new ArrayList<Watch>();
		}
		listWatch.add(watch);
	}
	
	public List<Person> getPeople(){
		List<Person> listPeople = new ArrayList<Person>();
		for(Watch watch : listWatch) {
			listPeople.add(watch.getPerson());
		}
		return listPeople;
	}
}
