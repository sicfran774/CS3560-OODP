package AssignmentTwo.QuestionOne;

public class StudentTest {
	public static void main(String[] args) {
		Student studentOne = new Student("John", "CS", 3.5);
		Student studentTwo = new Student();
		
		studentTwo.setName("Mary Ann");
		studentTwo.setMajor("CE");
		studentTwo.setGpa(3.3);
		
		System.out.println(studentOne);
		System.out.println(studentTwo);
	}
}
