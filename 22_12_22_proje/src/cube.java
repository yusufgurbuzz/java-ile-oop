
public class cube extends ThreeDimensionalShape {

	private double kenar;
	
	public cube(double kenar) {
		
		setKenar(kenar);
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(kenar, 2)*6;
	}

	@Override
	double getVolume() {
		// TODO Auto-generated method stub
		return Math.pow(kenar, 3);
	}

	public double getKenar() {
		return kenar;
	}

	public void setKenar(double kenar) {
		this.kenar = kenar;
	}

	public String toString() {
		
		return "Kenar  :"+ kenar+"  "+super.toString();
	}

}
