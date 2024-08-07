/* Knife--> weight,height--> init this using Const
declare details()
Ananya---> mobile,Knife --->init this using Const
declare details() */

class Knife{
	
	double weight;
	double height;
	
	Knife(double weight, double height)
	{
		this.weight=weight;
		this.height=height;
		System.out.println("Created Knife Const with double and double");
	}
	void show()
	{
		System.out.println("Knife_weight: "+weight);
		System.out.println("Knife_height: "+height);
	}
}

class Ananya{
	
	long Mobile;
	Knife knife;
	
	Ananya(long Mobile, Knife knife)
	{
		this.Mobile=Mobile;
		this.knife=knife;
		System.out.println("created Ananya Const using long and Knife");
	}
	void display()
	{
		System.out.println("Ananya_Mobile_No: "+Mobile);
		knife.show();
	}
	
}