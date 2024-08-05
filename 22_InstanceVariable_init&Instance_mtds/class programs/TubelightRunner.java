class TubelightRunner{
	
	
	public static void main(String[] args)
	{
		Tubelight tubelight = new Tubelight();
        tubelight.print();		
		System.out.println("===================================================");
		
		tubelight.setColour("White");
		tubelight.setPrice(100);
		tubelight.setWatts(40);
		
		System.out.println("Colour: "+ tubelight.colour);
		System.out.println("Price: "+ tubelight.price);
		System.out.println("Watts: "+ tubelight.watts);
		
		tubelight.print();
	}
}