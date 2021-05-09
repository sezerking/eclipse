package kodlamaIo2;

public class Student extends User{
	


	String details;

	public Student(int id, String firstName, String lastName, String email, String password, String details) {
		super(id, firstName, lastName, email, password);
		this.details = details;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
