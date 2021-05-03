package kodlamaIo;

public class CourseManager {
	
	public void signToCourse(Course course) {
		System.out.println("Kursa kayýt yaptýrdýnýz: "+course.courseName);
	}
	
	public void cancelSigningToCourse(Course course) {
		System.out.println("Kurs kaydýnýzý iptal ettiniz: "+ course.courseName);
	}

}
