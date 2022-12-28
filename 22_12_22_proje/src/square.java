
public class square extends TwoDimensionalShape {
 
        private int kose;	
	 
        public square(int kose){
        	
        	setKose(kose);
        }
	
	//a*a
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return kose*kose;
	}



	public int getKose() {
		return kose;
	}



	public void setKose(int kose) {
		this.kose = kose;
	}

 
       @Override
    public String toString() {
    // TODO Auto-generated method stub
    return "Köþe :"+ kose+"  "+super.toString();
    }
}
