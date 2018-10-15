public class Student {

	private String major;
	private double gpa;
	private int creditHours;
	
	//Getters
	protected String getMajor() {
		return major;
	}
	protected double getGpa() {
		return gpa;
	}
	protected int getCreditHours() {
		return creditHours;
	}
	
	//Setters
	protected void setMajor(String newMajor) {
		major = newMajor;
	}
	protected void setGpa(double newGpa) {
		gpa = newGpa;
	}
	protected void setCreditHours(int newCreditHours) {
		creditHours = newCreditHours;
	}
	
	//Constructor
	public Student(String newMajor, double newGpa, int newCreditHours) {
		major = newMajor;
		gpa = newGpa;
		creditHours = newCreditHours;
	}	
	
	public String getYear() {
		if (creditHours < 32) {
			return "Freshman";
		} else if (creditHours > 32 && creditHours < 64) {
			return "Sophomore";
		} else if (creditHours > 64 && creditHours < 96) {
			return "Junior";
		} else if (creditHours > 96) {
			return "Senior";
		} else {
			return "Error 404, Computer Exploding";
		}
	}
	
	public String toString() {
		return "Major: " + major + ", GPA: " + gpa + ", Credit Hours: " + creditHours;
	}
	
	
}
