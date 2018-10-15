public class Exchange extends Undergraduate  {

	public Exchange(String newMajor, double newGpa, int newCreditHours) {
		super(newMajor, newGpa, newCreditHours);
	}
	
	private String country;
	private String year = "Fall 2019";

	//Getters
	public String getYear() {
		return year;
	}
	public String getCountry() {
		return country;
	}
	
	//Setters
	public void setYear(String newYear) {
		year = newYear;
	}
	public void setCountry(String newCountry) {
		country = newCountry;
	}

}
