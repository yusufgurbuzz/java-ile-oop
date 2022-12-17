
public class CommisionEmployee extends Employee {

	private double grossSale,commissionRate;
	
	
	
	public CommisionEmployee(String firstname, String lastName, String SSN, double grossSale,double commissionRate) {
		super(firstname, lastName, SSN);
       
		this.commissionRate=commissionRate;
		this.grossSale=grossSale;
	
	}



	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate>0 && commissionRate<1?commissionRate:0;
	}
	@Override
	public double earning(){
		
		return grossSale*commissionRate;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}
