
public class StudentClient {

	public static void main(String[] args) {
		
		//Create Maya
		Undergraduate Maya = new Undergraduate("CS", 3.9, 54);
		Maya.setHonors(true);
		
		//Create John
		Graduate John = new Graduate("Computer Science", 4.10, 0);
		John.setConcentration("Cybersecurity");
		John.setYears(1);
		John.setDegree("Masters");
		
		//Create Exchange Student
		Exchange ExchangeStudent = new Exchange("Chemistry", 3.85, 54);
		ExchangeStudent.setYear("Summer 2017");
		ExchangeStudent.setCountry("Philippines");
	
		//Display Maya
		System.out.println("(Maya) Major: " + Maya.getMajor() + ", GPA: " + Maya.getGpa() + ", Year: " + Maya.getYear());
		System.out.println("Does Maya have honors? " + Maya.isHonors());
		System.out.println();
		
		//Display John
		System.out.println("(John) Concentration: " + John.getConcentration() + ", Years Spent in Grad School: " + John.getYear() + ", Major: " + John.getMajor());
		System.out.println();
		
		//Display Exchange Student
		System.out.println("(Exchange Student) GPA: " + ExchangeStudent.getGpa() + ", Major: " + ExchangeStudent.getMajor() + ", Country: " + ExchangeStudent.getCountry());
		System.out.println();
		
		

	}

}
