package AssignmentTwo.QuestionFive;

import java.util.List;

public class Course {
	private int code;
	private List<Book> books;
	
	public Course(int code, List<Book> books) {
		this.code = code;
		this.books = books;
	}
}
