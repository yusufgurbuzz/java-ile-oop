
public abstract class Employee implements Payable {

private String firstName,lastName,SSN;

public Employee(String firstName,String LastName,String SSN){
	
	setFirstName(firstName);
	setLastName(LastName);
	setSSN(SSN);
	
}

public String getSSN() {
	return SSN;
}

public void setSSN(String SSN) {
	this.SSN = SSN;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Override
	public String toString() {
		
	return "FirstName : "+ getFirstName()+"\nLastName :"+getLastName()+"\nSSN :"+getSSN();
	
	}


}
