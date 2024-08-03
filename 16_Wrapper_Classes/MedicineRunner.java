class MedicineRunner{
	public static void main(String[] args){
		System.out.println("Running Medicine in main");
		
		if(args.length==4){
			String name= args[0];
			String manfDate= args[1];
			String price= args[2];
			String quantity= args[3];
			
			int convertedPrice = Integer.parseInt(price);
			
			Medicine.info(name,manfDate,convertedPrice,quantity);
			
		
		}
		else {
			System.out.println("Enter 4 args");
		}
	}
}