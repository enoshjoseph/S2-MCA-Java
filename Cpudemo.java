class Cpu{
	
	String price;
	public Cpu(String a){
		
		price = a;
		
	}
	public void display(){
		System.out.println("Price is "+price);
	}
	
	class Processor{
		
		int cores;
		String manufacturer;
		
		public Processor(int a, String b){
			
			cores = a;
			manufacturer = b;
			
		} 
		
		public void display(){
			
			System.out.println("Number of cores: "+cores+ " Name of Manufacturer: "+manufacturer);
		}
	}
	
	static class Ram{
		
		String memory;
		String manufacturer;
		
		public Ram(String a, String b){
			
			memory = a;
			manufacturer = b;
		}
	
	
	public void display(){
		
		System.out.println("Memory: "+memory+" Name of manufacturer: "+manufacturer);
		}
	}
}

class Cpudemo{
	
	public static void main(String s[]){
		
		Cpu c = new Cpu("10000");
		c.display();
		Cpu.Processor p = c.new Processor(6,"Intel");
		p.display();
		
		Cpu.Ram r= new Cpu.Ram("HDD", "Sandisk");
		r.display();
	}
}
	
