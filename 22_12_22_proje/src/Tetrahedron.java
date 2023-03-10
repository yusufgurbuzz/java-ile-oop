
public class Tetrahedron extends ThreeDimensionalShape {
 
	private double ayritUzunlugu;
	
	public Tetrahedron(double ayritUzunlugu) {
		
		setAyritUzunlugu(ayritUzunlugu);
		
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(ayritUzunlugu, 2)*Math.sqrt(3);
	}

	@Override
	double getVolume() {
		// TODO Auto-generated method stub
		return (Math.pow(ayritUzunlugu, 3)*Math.sqrt(2))/12;
	}

	public double getAyritUzunlugu() {
		return ayritUzunlugu;
	}

	public void setAyritUzunlugu(double ayritUzunluğu) {
		this.ayritUzunlugu = ayritUzunluğu;
	}
	public String toString() {
	

		return "Ayrıt Uzunluğu  :"+ ayritUzunlugu+"  "+super.toString();
	}


}
