class Tubelight{
	
	String colour;
	double price;
	int watts;
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setWatts(int watts)
	{
		this.watts = watts;
	}
	
	
	public void print()
	{
		System.out.println("Colour: "+colour);
		System.out.println("Price: "+price);
		System.out.println("Watts: "+watts);
	}
}