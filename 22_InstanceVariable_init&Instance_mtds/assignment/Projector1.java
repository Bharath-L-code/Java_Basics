class Projector1
{
	String company;
	String type="Auto";
	String color;
	double weight;
	
	public void display()
	{
		System.out.println("Projector1 company is:"+this.company);
		System.out.println("Projector1 type is:"+this.type);
		System.out.println("Projector1 color is:"+this.color);
		System.out.println("Projector1 weight is:"+this.weight);

	}
	
	public Projector1(String company,String color,double weight)
	{
		this.company=company;
		this.color=color;
		this.weight=weight;
		System.out.println("Created Projector1");
	}
	
	public void setProjector1(String company,String color,double weight)
	{
		this.company=company;
		this.color=color;
		this.weight=weight;
		System.out.println("Created Pojector1");
	}
	
	
	public static void main(String[] args)
	{
		Projector1 projector1=new Projector1("Sony","Black",25);
		projector1.display();
		projector1.setProjector1("Samsung","White",26);
		projector1.display();
		System.out.println();
		
		Projector1 projector2=new Projector1("Mi","Pink",27);
		projector2.display();
		projector2.setProjector1("Mac","Purple",28);
		projector2.display();
		System.out.println();
		
		Projector1 projector3=new Projector1("Cannon","Brown",29);
		projector3.display();
		projector3.setProjector1("HP","Grey",23);
		projector3.display();
		System.out.println();
	}
}

/* op

Created Projector1
Projector1 company is:Sony
Projector1 type is:Auto
Projector1 color is:Black
Projector1 weight is:25.0
Created Pojector1
Projector1 company is:Samsung
Projector1 type is:Auto
Projector1 color is:White
Projector1 weight is:26.0

Created Projector1
Projector1 company is:Mi
Projector1 type is:Auto
Projector1 color is:Pink
Projector1 weight is:27.0
Created Pojector1
Projector1 company is:Mac
Projector1 type is:Auto
Projector1 color is:Purple
Projector1 weight is:28.0

Created Projector1
Projector1 company is:Cannon
Projector1 type is:Auto
Projector1 color is:Brown
Projector1 weight is:29.0
Created Pojector1
Projector1 company is:HP
Projector1 type is:Auto
Projector1 color is:Grey
Projector1 weight is:23.0   */