public class Undergraduate extends Student {
	
	public Undergraduate(String newMajor, double newGpa, int newCreditHours) {
		super(newMajor, newGpa, newCreditHours);
		
	}
	
	private boolean honors;
	
	public boolean isHonors() {
		return honors;
	}
	
	//Getters
	public boolean getHonors() {
		return honors;
	}
	
	//Setters
	public void setHonors(boolean newBoolean) {
		honors = newBoolean;
	}

	
}
