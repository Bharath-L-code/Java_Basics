class Speaker{
	
	String brand;
	int size;
	double price;
	boolean output;
	
	// constructor 
	Speaker(String brand, int size, double price, boolean output)
	{
		this.brand=brand;
		this.size=size;
		this.price=price;
		this.output=output;
		System.out.println("Speaker is created");
	}
	public void setSpeaker(String brand, int size, double price, boolean output)
	{
		this.brand=brand;
		this.size=size;
		this.price=price;
		this.output=output;
		System.out.println("Speaker is created");
	}
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("size: "+size);
		System.out.println("price: "+price);
		System.out.println("Working_output: "+output);
	}





		// main mtd
		public static void main(String[] args)
		{
			System.out.println("Running in main mtd");
			System.out.println("===============================================");
			
			Speaker speaker = new Speaker("sony", 10, 5000.00, true);
			speaker.display();
			System.out.println("-----------------------------------------------");
			speaker.setSpeaker("samsung",5,4000.00,false);
			speaker.display();
			System.out.println("===============================================");
			
			
			Speaker speaker1 = new Speaker("jbl", 20, 25000.00, true);
			speaker.display();
			System.out.println("-----------------------------------------------");
			speaker.setSpeaker("Lg",5,4000.00,false);
			speaker.display();
			System.out.println("===============================================");
			
			Speaker speaker2 = new Speaker("Boat", 10, 5000.00, true);
			speaker.display();
			System.out.println("-----------------------------------------------");
			speaker.setSpeaker("Noises",5,4000.00,false);
			speaker.display();
			System.out.println("===============================================");
			
		}
}

/*                  Output
Running in main mtd
===============================================
Speaker is created
Brand: sony
size: 10
price: 5000.0
Working_output: true
-----------------------------------------------
Speaker is created
Brand: samsung
size: 5
price: 4000.0
Working_output: false
===============================================
Speaker is created
Brand: samsung
size: 5
price: 4000.0
Working_output: false
-----------------------------------------------
Speaker is created
Brand: Lg
size: 5
price: 4000.0
Working_output: false
===============================================
Speaker is created
Brand: Lg
size: 5
price: 4000.0
Working_output: false
-----------------------------------------------
Speaker is created
Brand: Noises
size: 5
price: 4000.0
Working_output: false
===============================================
*/