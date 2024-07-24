class Blood{
	
	public static String group(){
		System.out.println("running group in Blood");
		String group = "B positive";
		System.out.println("group: "+ group);
		return group;
	}
	public static String personName(){
		System.out.println("running personName in Blood");
		String personName = "Bharath";
		System.out.println("Person: "+ personName);
		return personName;
	}
	public static double cost(){
		System.out.println("running cost in Blood");
		double Money = 1000.00;
		System.out.println("cost: "+ Money );
		return Money;
	}
	public static String hospitalTested(){
		System.out.println("running hospitalTested in Blood ");
		String HospitalName = "manipal";
		System.out.println("Hospital Name: "+ HospitalName );
		return HospitalName;
	}
	public static char hospitalTested1(){
		System.out.println("running hospitalTested1 in Blood ");
		char yesORno = 'y';
		System.out.println("hospitalTested1: "+ yesORno );
		return yesORno;
	}
	public static char sickORnot(){
		System.out.println("running sickORnot in Blood ");
		char sickORnot = 'n';
		System.out.println("sickORnot: "+ sickORnot);
		return sickORnot;
	}
	public static boolean donatedORnot(){
		System.out.println("running donatedORnot in Blood");
		boolean state = true;
		System.out.println("donatedORnot: "+ state);
		return state;
	}
}