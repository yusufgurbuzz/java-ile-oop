
public class Sphere extends ThreeDimensionalShape {
   
	
	private double yaricap;
	
	public Sphere(double yaricap){
		
		setYaricap(yaricap);
		
	}
	
	
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 4*Math.PI*yaricap*yaricap;
	}

	@Override
	double getVolume() {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*yaricap*yaricap*yaricap;
	}

	public double getYaricap() {
		return yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}

	   @Override
	    public String toString() {
	    // TODO Auto-generated method stub
	    return "Yarýcap :"+ yaricap+"  "+super.toString();
	    }
	
	
	


}
