class TabletRunner{
	
	public static void main(String[] args)
	{
		Tablet tablet = new Tablet();
		tablet.setName("Dolo"); // setter mtd
		System.out.println("Tablet Name: "+tablet.name);
		
		tablet.setPrice(10);
		System.out.println("Tablet Price: "+tablet.price);
		
		
		
		
		Tablet tablet1 = new Tablet();
		    tablet.display();
		System.out.println("Tablet 1 Name: "+tablet1.name);  // null
		System.out.println("Tablet 1 Price: "+tablet1.price); // 0.0 
		
		
		tablet1.setName("Crocin");
		tablet1.setPrice(8);
			tablet1.display();
		System.out.println("Tablet 1 updatedName: "+tablet1.name);  
		System.out.println("Tablet 1 updatedPrice: "+tablet1.price);
		
		
	}
}