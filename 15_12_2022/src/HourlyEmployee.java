
public class HourlyEmployee extends Employee{

	private double wage,hours;
	
	public HourlyEmployee(String firstname, String lastName, String SSN, double wage,double hours) {
		super(firstname, lastName, SSN);
		
		setHours(hours);
		setWage(wage);
		
	}
	@Override
	public double earning() {
		
	/*	if(hours<=40)
		{
			return wage*hours;
			
		}
		else
		{
			return 40*wage+(hours-40)*wage*1.5;
			
		}*/
		double maas=0;
	
		return maas=hours<40?wage*hours:wage*hours+40;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nWage:"+wage+"\nHours"+hours;
	}
	
	
}
