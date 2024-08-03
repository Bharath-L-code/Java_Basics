class JuiceRunner{
	public static void main(String[] args){
		System.out.println("Running Medicine in main");
		
		if(args.length==5){
			String name= args[0];
			String brand= args[1];
			String flavour=args[2];
			String price=args[3];
			String quantity=args[4];
			
			double convertedPrice = Double.parseDouble(price);
			
			Juice.info(name,brand,flavour,convertedPrice,quantity);
			
		
		}
		else {
			System.out.println("Enter 4 args");
		}
	}
}