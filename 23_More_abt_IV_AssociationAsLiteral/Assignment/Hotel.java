class Owner{
	
	String name;
	int age;
	char gender;
	
	//constructor with args
	Owner(String name, int age, char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		
		
		System.out.println("creating Owner with 3 args");
	}
	
	void print()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("gender: "+this.gender);
		
	}
	
}

class Hotel{
	
	String HotelName = "Indraprasta";
	Owner owner = new Owner("Raju", 55, 'M');
	
	public void show()
	{
		System.out.println("Hotel_Name: "+this.HotelName);
		System.out.println("Owner_Name: "+this.owner.name);
		System.out.println("Owner_age: "+this.owner.age);
		System.out.println("Owner_gender: "+this.owner.gender);     //   this.owner.print()
		
	}
}

