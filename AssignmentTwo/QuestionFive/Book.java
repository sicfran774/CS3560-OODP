package AssignmentTwo.QuestionFive;

public class Book {
	private String name;
	private String author;
	private Course course;
	
	public Book() {
		name = "";
		author = "";
		course = null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
