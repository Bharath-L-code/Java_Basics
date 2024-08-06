class Chocolate{
	
	String brand;
	double cost;
	String flavour;
	char size;
	
	Chocolate(String brand, double cost, String flavour, char size)
	{
		this.brand=brand;
		this.cost=cost;
		this.flavour=flavour;
		this.size=size;
		System.out.println("Creating Chocolate");
	}
	public void setChocolate(String brand, double cost, String flavour, char size)
	{
		this.brand=brand;
		this.cost=cost;
		this.flavour=flavour;
		this.size=size;
		System.out.println("Creating Chocolate");
	}
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("cost: "+cost);
		System.out.println("flavour: "+flavour);
		System.out.println("size: "+size);
	}
	
	
	
	
	// main mtd
	public static void main(String[] args)
	{
		
		System.out.println("Running in main mtd");
			System.out.println("===============================================");
			
			Chocolate chocolate = new Chocolate("cadburry", 200, "nuts", 'm');
			chocolate.display();
			System.out.println("-----------------------------------------------");
			chocolate.setChocolate("Nestle", 300, "mixed", 's');
			chocolate.display();
			System.out.println("===============================================");
			
			
			Chocolate chocolate1 = new Chocolate("snickers", 350, "almond", 's');
			chocolate.display();
			System.out.println("-----------------------------------------------");
			chocolate.setChocolate("Kismi", 300, "honey", 'l');
			chocolate.display();
			System.out.println("===============================================");
			
			Chocolate chocolate2 = new Chocolate("cadburry", 200, "nuts", 'm');
			chocolate.display();
			System.out.println("-----------------------------------------------");
			chocolate.setChocolate("snickers", 350, "almond", 's');
			chocolate.display();
			System.out.println("===============================================");
	}	
}

/*   output

Running in main mtd
===============================================
Creating Chocolate
Brand: cadburry
cost: 200.0
flavour: nuts
size: m
-----------------------------------------------
Creating Chocolate
Brand: Nestle
cost: 300.0
flavour: mixed
size: s
===============================================
Creating Chocolate
Brand: Nestle
cost: 300.0
flavour: mixed
size: s
-----------------------------------------------
Creating Chocolate
Brand: Kismi
cost: 300.0
flavour: honey
size: l
===============================================
Creating Chocolate
Brand: Kismi
cost: 300.0
flavour: honey
size: l
-----------------------------------------------
Creating Chocolate
Brand: snickers
cost: 350.0
flavour: almond
size: s
===============================================
*/