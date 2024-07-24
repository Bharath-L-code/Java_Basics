class Geo{
	public static String countryName(int countryCode){
		System.out.println("starting countryName in Geo");
		System.out.println("CountryCode: "+ countryCode);
		
		if(countryCode == 91)
		{
			return "India";
		}
		if(countryCode == 60)
		{
			return "Malaysia";
		}
		if(countryCode == 64)
		{
			return "New Zealand";
		}
		if(countryCode == 65)
		{
			return "Singapore";
		}
		if(countryCode == 66)
		{
			return "Thailand";
		}
		
		return "No_Country_Found";
	}
	public static double product(String item){
		System.out.println("starting product in item");
		System.out.println("Product: "+ item);
		
		if(item == "MRF")
		{
			return 2000.025;
		}
		if(item == "CEAT")
		{
			return 3000.035;
		}
		if(item == "SS")
		{
			return 4000.045;
		}
		if(item == "SG_English_willow")
		{
			return 5000.055;
		}
		if(item == "DSC")
		{
			return 6000.0345;
		}
		return 10000.00;
	}
	public static String ProducerName(String Movie){
		System.out.println("Starting films in Geo");
		System.out.println("The Producer Name is: "+Movie);
		
		if(Movie == "RRR")
		{
			return "SS RajaMouli";
		}
		if(Movie == "KGF")
		{
			return "Prashanth Neel";
		}
		if(Movie == "Ui")
		{
			return "Upendra";
		}
		if(Movie == "Open heimer")
		{
			return "Nolan";
		}
		if(Movie == "Ms Dhoni")
		{
			return "Niraj Pandey";
		}
		return "Director Unknown";
	}
}

