


public class circle extends TwoDimensionalShape{

	 private double yaricap;
	
	 
	 public circle(double yaricap){
		 
		 setYaricap(yaricap);
	 }
	
	
	
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*getYaricap()*getYaricap();
	}
     //pi*rkare





	public double getYaricap() {
		return yaricap;
	}





	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "Yarýcapý :"+ yaricap+"Alan :" +getArea()+" "+getClass().getName();
		return "Yarýcapý :"+ yaricap+"  "+super.toString();
	}
	


}
