
public class main {

	public static void main(String[] args) {
		
		Shape[] obj= new Shape[7];
		obj[0]= new square(2);
		obj[1]= new square(5);
		obj[2]= new triangle(10,5);
		obj[3]= new circle(10);
		obj[4]= new Sphere(5);
		obj[5]= new cube(5);
		obj[6]= new Tetrahedron(10);
		
		
		
		for(Shape sp:obj){
			
			System.out.println(sp.toString());
			
		}
		
		
		
		
		

	}

}
