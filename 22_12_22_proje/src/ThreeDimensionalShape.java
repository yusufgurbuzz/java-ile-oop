
public abstract class ThreeDimensionalShape extends Shape {

	abstract double getArea();
	abstract double getVolume();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " alan: "+ getArea()+"  hacim  "+ getVolume()+"  " + getClass().getName();
	}
	
	
	
}
