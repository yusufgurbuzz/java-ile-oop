
public class SalaryEmployee extends Employee {

	private double weeklySalary;
	
	public SalaryEmployee(String firstName, String LastName, String SSN,double weeklySalary) {
		super(firstName, LastName, SSN);
		// TODO Auto-generated constructor stub
		setWeeklySalary(weeklySalary);
		
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary>0?weeklySalary:0;;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nWeeklySalary :"+getWeeklySalary();
	}
	
	

}
