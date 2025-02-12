class Zoo{
	String name;
	String[] encl;
	
	public Zoo(String n, String[] enc){
		name = n;
		encl=enc; 
		
		}
		public void display(){
			
			System.out.println("Name of the animal: "+name);
			for (String x:encl)
			{
				System.out.println(x);
			}
		}
		
		class Enclosure{
			
			String name;
			String type;
			String[] animals;
			
			public Enclosure(String n, String t, String[] a){
				
				name = n;
				type = t;
				animals = a;
			}
			public void display(){
				
				System.out.println("name: "+name+" type"+type);
				System.out.println("Animals: ");
				for (String x:animals){
				
				System.out.println(x);
				}
			}
		}
		static class Zooinfo{
			
			String adr;
			String phno;
			
			public Zooinfo(String a, String ph){
				
				adr = a;
				phno = ph;
			}
			
			public void display(){
				System.out.println("Address of the animal "+adr+"Phone no: "+phno);
			}
		}
	}
	
class Zoodemo{
	
	public static void main(String[] s){
		
		String enclosure[]={"Indoor","Outdoor","Wild"};
		String animals[] = {"Giya","Eldees","Krishnan"};
		Zoo z = new Zoo("Enosh",enclosure);
		z.display();
		
		Zoo.Enclosure e = z.new Enclosure("sdf", "Wild", animals);
		e.display();
		
		Zoo.Zooinfo i = new Zoo.Zooinfo("moovatupuzha","3476827342");
		i.display();
	}
}

