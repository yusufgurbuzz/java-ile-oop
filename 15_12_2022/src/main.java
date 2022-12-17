
public class main {

	public static void main(String[] args) {
		
		//Abstractý olandan nesne üretilmez
	
		
		CommisionEmployee cm= new CommisionEmployee("hakan", "güler", "nev", 22, 17.8);
		BasePlusCom bs= new BasePlusCom("yusuf", "gürbüz", "beyza", 12, 2, 55);
		
		SalaryEmployee sl = new SalaryEmployee("kerem", "aydin", "ahmet", 17.3);
		
	
		
		HourlyEmployee hr = new HourlyEmployee("ayþe", "hakan", "bili", 19, 100);
		
	 System.out.println(bs.toString());	
     System.out.println(sl.toString());	
	System.out.println(hr.toString());	
	System.out.println(cm.toString());	
	 System.out.println("-----------------------------------------------------------------------------------------");
	 Employee[] a = new Employee[4];
	 a[0]=sl;
	 a[1]=hr;
	 a[2]=cm;
	 a[3]=bs;
	 
	 for (Employee employee : a) {
		
		 System.out.println(employee.earning());
	}
	 
	 
	 
	}

}
