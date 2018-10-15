public class Graduate extends Student {

	public Graduate(String newMajor, double newGpa, int newCreditHours) {
		super(newMajor, newGpa, newCreditHours);
	}

	private String degree = "masters";
	private String concentration;
	private int years = 0;
	
	//Getters
	public String getDegree() {
		return degree;
	}
	public String getConcentration() {
		return concentration;
	}
	public String getYear() {
		return Integer.toString(years);
	}	

	//Setters
	public void setDegree(String newDegree) {
		degree = newDegree;
	}
	public void setConcentration(String newConcentration) {
		concentration = newConcentration;
	}
	public void setYears(int newYears) {
		years = newYears;
	}
	
}
