package kodlamaIo;

public class CourseManager {
	
	public void signToCourse(Course course) {
		System.out.println("Kursa kay�t yapt�rd�n�z: "+course.courseName);
	}
	
	public void cancelSigningToCourse(Course course) {
		System.out.println("Kurs kayd�n�z� iptal ettiniz: "+ course.courseName);
	}

}
