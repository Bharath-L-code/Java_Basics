class Bakery{
	
	String name = "Variar_OG";
	
	Location location = new Location();
	
	
	
	public void display()
	{
		System.out.println("Name: "+name);
		
		System.out.println("Location_street: "+location.street);
		System.out.println("Location_city: "+location.city);
		System.out.println("Location_pin: "+location.pin);
	}
}