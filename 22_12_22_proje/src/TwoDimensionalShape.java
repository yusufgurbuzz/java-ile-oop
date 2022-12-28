
public abstract class TwoDimensionalShape extends Shape {

	abstract double getArea();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "alan: "+ getArea()+" " + getClass().getName();
	}
	
	
	
}
