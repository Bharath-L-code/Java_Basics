class Paint{
	public static void BrandName(String name){
		System.out.println("Running BrandName in Paint with string parameter");
		System.out.println("NameoftheBrand: "+ name );
	}
	public static void brandAndColour(String Brand, String Colour){
		System.out.println("Running brandAndColour in Paint with 2 String parameters");
		System.out.println("brandandcolour: "+ Brand +" "+Colour);
	}
	public static void brandAndPrice(String Brand, double price){
		System.out.println("Running brandAndPrice in Paint with 1 String parameters, one is string and another double");
		System.out.println ("brandandprice: "+ Brand +" "+ price);
	}
	public static void totalProduct(String colour, String type, double price){
		System.out.println("Running brandAndPrice in Paint with 2 String parameters, another one  is double");
		System.out.println("ProductOverview: "+  colour+" "+type+" "+price);
	}
}