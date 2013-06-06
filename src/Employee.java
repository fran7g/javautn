
public class Employee extends Customer{

	private long employID;
	
	
	//methods
	
	public long getEmployID() {
		return employID;
	}

	public void setEmployID(long employID) {
		this.employID = employID;
	}
	
	public String toString(){
		
		return "[Employee]" + super.toString();
		
	}
	
}
