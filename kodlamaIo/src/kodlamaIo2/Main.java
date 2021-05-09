package kodlamaIo2;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student student=new Student();
		student.setId(0);
		student.setFirstName("Sezer");
		student.setLastName("Kara");
		student.setEmail("sezerkara@mail.com");
		student.setDetails("20 yas");
		student.setPassword("123456");
		
		StudentManager manager=new StudentManager();
		manager.registerToCourse(student);
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Seckin");
		instructor.setLastName("Kara");
		instructor.setEmail("seckinkara@mail.com");
		instructor.setCourseName("Java kursu");
		instructor.setPassword("123456");
		
		InstructorManager manager2=new InstructorManager();
		manager2.createCourse(instructor);
		
		
		UserManager manager3=new UserManager();
		manager3.register(student);
		manager3.register(instructor);
		
		
	}

}
