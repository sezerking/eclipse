package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(0, "C# ve Angular", "C# ve Angular ile kodlama");
		
		Course course2= new Course(1, "Java ve React", "Jave ve React ile kodlama");
		
		CourseManager courseManager=new	CourseManager();
		courseManager.signToCourse(course1);
		courseManager.signToCourse(course2);
		
		courseManager.cancelSigningToCourse(course2);

	}

}
