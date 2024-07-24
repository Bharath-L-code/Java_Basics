class Train{
	public static void book(String source, String destination){
		System.out.println("Running book in Train with 2 parameters");
		System.out.println("Tour from: "+ source);
		System.out.println("Tour to: "+ destination);
	}
	public static void book(String source, String destination, int people){
		System.out.println("Running book in Train with 3 parameters");
		System.out.println("Tour from to and total members: "+source+" "+destination+" "+people);
		
	}
	public static void book(String source, String destination, int people, double price){
		System.out.println("Running book in Train with 4 parameters");
		System.out.println("Tour from to and total members: "+ source+" "+destination+" "+people+" "+price);
	}
	public static void cancel(int TicketNo){
		System.out.println("Running cancel in Train with 1 parameter");
		System.out.println("No of tickets canceled: "+ TicketNo);
	}
	public static void cancel(String source, String destination){
		System.out.println("Running cancel in Train with 2 parameter");
		System.out.println("canceled source and destination: "+ source);
		System.out.println("canceled source and destination: "+ destination);
	}
	
	
}