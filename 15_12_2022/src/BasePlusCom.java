
public class BasePlusCom extends CommisionEmployee {

	
	private double baseSalaray;
	
	
	public BasePlusCom(String firstname, String lastName, String SSN, double grossSale, double commissionRate,double baseSalary) {
		super(firstname, lastName, SSN, grossSale, commissionRate);
		this.baseSalaray= baseSalary;
	}


	public double getBaseSalaray() {
		return baseSalaray;
	}


	public void setBaseSalaray(double baseSalaray) {
		this.baseSalaray = baseSalaray;
	}
	
	@Override
	public String toString() {
	
		return super.toString()+"\nBaseSalaray"+baseSalaray;
	}
	
	@Override
	public double earning() {
		
		return super.earning()+baseSalaray;
	}
	

}
