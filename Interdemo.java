import java.util.*;
interface Eldees{

	public void area();
	public void perimeter();
	
	
}

class Rectangle implements Eldees{
	
	int l,b;
	Rectangle(int l, int b){
	
	 this.l=l;
	 this.b=b;
	}
	
	public void  area(){
		
		System.out.println(l*b);
	}
	
	public void  perimeter(){
			
		System.out.println(2*(l+b));
	}

}

class Circle implements Eldees{

	int r;
	Circle(int r)
	{
		
		this.r = r;
		
	}
	public void  area(){
		
		System.out.println(3.14*r*r);
	}
	
	public void  perimeter(){
		
		System.out.println( 2*3.14*r);
	}
}

class Interdemo{
	
	public static void main(String[] a){
		
		Scanner s =  new Scanner(System.in);
		Rectangle r = new Rectangle(10,9);
		Circle c = new Circle(5);
		while(true){
		System.out.println("1 Rectangle\n 2Circle");
		System.out.println("ENter the choice: ");
		
		int v = s.nextInt();
		switch(v){
		
			case 1:r.area();
			break;
			
			case 2: c.area();
			break;
			
		
			default:System.out.println("ENter th evalid choice...");
			break;
		}
		
		
	}
}
}
