
public abstract class Employee {

	private String firstname,lastName,SSN;
	
	public Employee(String firstname,String lastName, String SSN ){
		
		this.firstname=firstname;
		this.lastName=lastName;
		this.SSN=SSN;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	

	
	public abstract double earning();
	
	@Override //normalde tüm sýnýflar obje sýnýfýndan türetilir. Biz burada var olan toString metodunu güncelledik.
	public String toString(){
		return String.format("FirstName:%s\nLastName:%s\nSSN:%s\n",firstname,lastName,SSN);
		
    }
	
	
	
	
	
}
