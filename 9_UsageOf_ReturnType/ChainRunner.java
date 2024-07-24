class ChainRunner{
	public static void main(String [] args){
		
		System.out.println("Running main in ChainRunner");
		
		int ref1 = Chain.carat();
		double ref2 = Chain.CostperGram();
		String ref3 = Chain.type();
		char ref4 = Chain.qualityCheck();
		int ref5 = Chain.quantity();
		float ref6 = Chain.wastage();
		double ref7 = Chain.ServiceTax();
	}
}