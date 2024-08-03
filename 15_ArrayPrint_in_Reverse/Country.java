class Country{
	public static void states(String[] states){
		System.out.println("List of States starts");
		
		for(int sname=states.length-1;sname>=0;sname--){
			System.out.println("State :"+states[sname]);
		}
		System.out.println("List of states ends");
	}
	
	
	public static void pin(int[] pin){
		System.out.println("List of Pincodes starts");
		for(int pn=pin.length-1;pn>=0;pn--){
			System.out.println("Pincode :"+pin[pn]);
		}
		System.out.println("List of Pincodes ends");
	}
	
	
	public static void pm(String[] pm){
		System.out.println("List of Prime Ministers of India starts");
		for(int pname=pm.length-1;pname>=0;pname--){
			System.out.println("Prime Minister Name :"+pm[pname]);
		}
		System.out.println("List of Prime Ministers of India ends");
	}
	
	
	public static void cm(String[] cm){
		System.out.println("List of Cabinet Ministers starts");
		for(int cname=cm.length-1;cname>=0;cname--){
			System.out.println("Cabinet Minister Name :"+cm[cname]);
		}
		System.out.println("List of Cabinet Minsisters ends");
	}
	
	
	public static void pp(String[] pp){
		System.out.println("List of Political Parties starts");
		for(int ppname=pp.length-1;ppname>=0;ppname--){
			System.out.println("Political Party Name :"+pp[ppname]);
		}
		System.out.println("List of Political Parties ends");
	}
}