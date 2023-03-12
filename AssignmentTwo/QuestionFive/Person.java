package AssignmentTwo.QuestionFive;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private List<Watch> listWatch;
	
	public Person(String name, List<Watch> listWatch) {
		this.name = name;
		this.listWatch = listWatch;
	}
	
	public void addWatch(Watch watch) {
		if(listWatch == null) {
			listWatch = new ArrayList<Watch>();
		}
		listWatch.add(watch);
	}
	
	public List<Movie> getMovies(){
		List<Movie> listMovies = new ArrayList<Movie>();
		for(Watch watch : listWatch) {
			listMovies.add(watch.getMovie());
		}
		return listMovies;
	}
}
