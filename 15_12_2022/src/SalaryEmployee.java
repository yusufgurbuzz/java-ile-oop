
public class SalaryEmployee extends Employee {

	
	private double weeklySalaray;
	
	
	public SalaryEmployee(String firstname, String lastName, String SSN,double weeklySalaray) {
		super(firstname, lastName, SSN);
		//this.weeklySalaray=weeklySalaray;
		setWeeklySalaray(weeklySalaray);
	}

	@Override
	public double earning() {
	
		return weeklySalaray;
	}

	public double getWeeklySalaray() {
		return weeklySalaray;
	}

	public void setWeeklySalaray(double weeklySalaray) {
		this.weeklySalaray = weeklySalaray>0?weeklySalaray:0;
	}
  
	@Override
	public String toString() {// employeden kulland�k. tostring metoduna ulas�mak i�in de superi kulland�k
	
		return super.toString()+ "\nWeeklySalaray "+weeklySalaray;
	}
	
	
	
	
	
	
}
