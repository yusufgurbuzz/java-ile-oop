
public class triangle extends TwoDimensionalShape {

	private double taban,yukseklik;
	
	public triangle(double taban,double yukselik){
		
		setTaban(taban);
		setYukseklik(yukselik);
		
	}
	
	
	
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (taban*yukseklik)/2;
	}
          //ücgen (taban*yükseklik)/2


	public double getYukseklik() {
		return yukseklik;
	}


	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}


	public double getTaban() {
		return taban;
	}


	public void setTaban(double taban) {
		this.taban = taban;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Taban :"+ taban +" Yükseklik :"+yukseklik+"  "+super.toString();
	}
	
	

}
