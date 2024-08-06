class SoftwareEnginner
{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEnginner(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void print()
	{
		System.out.println("name:"+this.name);
		System.out.println("experience:"+this.experience);
		System.out.println("designation:"+this.designation);
		System.out.println("salary:"+this.salary);
		
	}
}

class Company
{
	int id;
	String name;
	String location;
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("Om",15,"Senior_Software_Engineer",6500000);
	
	Company(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void display()
	{
		/*System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("location:"+this.location);   // this.softwareEnginner.print();
	    softwareEnginner.print(); */
		this.softwareEnginner.print();
	}
}