
public class main {

	public static void main(String[] args) {
		
		Payable[] object = new Payable[4];
		object[0]= new Invoice("a14", "R", 14, 7);
		object[1]= new Invoice("z", "a", 7, 6);
		//Invoice obj = new Invoice(....);
		//objects[0]=obj;
		
		
		object[2]= new SalaryEmployee("yusuf", "gürbüz", "xx", 5);
		object[3]= new SalaryEmployee("yusuf", "hakan", "dx", 7);
		
        for(Payable pb:object){
        	
        	System.out.println(pb.toString()+"\n");
        	
        	System.out.println("Payment Amount:"+pb.getPaymentAmount());
        }
		
		
		
	}

}
