class GeoRunner{
	public static void main(String[] args){
		
		String ref = Geo.countryName(91);
		System.out.println("Country_Name: "+ref);
		
		ref = Geo.countryName(60);
		System.out.println("Country_Name: "+ref);
		
		ref = Geo.countryName(80);
		System.out.println("Country_Name: "+ref);
		
		String ref2 = Geo.countryName(64);
		System.out.println("Country_Name: "+ref2);
		
		
		System.out.println("====================================================================");
		
		double cost = Geo.product("CEAT");
		System.out.println("Cost of product: "+cost);
		
		double cost1 = Geo.product("MRF");
		System.out.println("Cost of product: "+cost1);
		
		double cost2 = Geo.product("Kokkaburrah");
		System.out.println("Cost of product: "+cost2);
		
		
		System.out.println("====================================================================");
		
		String Producer = Geo.ProducerName("KGF");
		System.out.println("Producer Name: "+Producer);
		
		
		Producer = Geo.ProducerName("RRR");
		System.out.println("Producer Name: "+Producer);
		
		Producer = Geo.ProducerName("Avengers Endgame");
		System.out.println("Producer Name: "+Producer);
		
		
	}
}