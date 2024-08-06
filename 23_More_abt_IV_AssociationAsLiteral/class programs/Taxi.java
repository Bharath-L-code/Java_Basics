class Driver{
	
	String name;
	String licNo;
	int age;
	
	Driver()
	{
		System.out.println("creating Driver with no args");
	}
	Driver(String name, String licNo, int age)
	{
		this.name=name;
		this.licNo=licNo;
		this.age=age;
		System.out.println("creating Driver with 3 args");
	}
	
	public void Bha()
	{
		System.out.println("Driver_Name: "+this.name);
		System.out.println("Driver_licNo: "+this.licNo);
		System.out.println("Driver_age: "+this.age);
		
	}
}


class Taxi{
	
	String company = "Ola";
	Driver driver = new Driver("harisha","112",30);
	
	Taxi()
	{
		System.out.println("created a Taxi with no args");
	}
	public void print()
	{
    	System.out.println("Company_Name: "+this.company);                  //  
		System.out.println("Driver_Name: "+this.driver.name);                  //
		System.out.println("Driver_LicNo: "+this.driver.licNo);                //
		System.out.println("Driver_age: "+this.driver.age);                   // or this.driver.Bha();
		
	}
}