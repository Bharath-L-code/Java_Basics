class Paper
{
	double thickness=2.5;
	char size;
	boolean quality;
	String color;
	
	public  void display()
	{
		System.out.println("Paper thickness is:"+this.thickness);
		System.out.println("Paper size is:"+this.size);
		System.out.println("Paper quality is:"+this.quality);
		System.out.println("Paper color is:"+this.color);
	}
	
	public Paper(char size,boolean quality,String color)
	{
	this.size=size;
	this.quality=quality;
	this.color=color;
	System.out.println("Created Paper");
	}
	public void setPaper(char size,boolean quality,String color)
	{
	this.size=size;
	this.quality=quality;
	this.color=color;
	System.out.println("Created Paper");
	}
	
	public static void main(String[] args)
	{
		Paper paper1=new Paper('S',true,"White");
		paper1.display();
		paper1.setPaper('L',true,"Red");
		paper1.display();
		System.out.println();
		
		Paper paper2=new Paper('M',true,"Black");
		paper2.display();
		paper2.setPaper('S',true,"Green");
		paper2.display();
		System.out.println();
		
		Paper paper3=new Paper('L',true,"Pink");
		paper3.display();
		paper3.setPaper('M',true,"Blue");
		paper3.display();
		System.out.println();
	}
}


/*  op

Created Paper
Paper thickness is:2.5
Paper size is:S
Paper quality is:true
Paper color is:White
Created Paper
Paper thickness is:2.5
Paper size is:L
Paper quality is:true
Paper color is:Red

Created Paper
Paper thickness is:2.5
Paper size is:M
Paper quality is:true
Paper color is:Black
Created Paper
Paper thickness is:2.5
Paper size is:S
Paper quality is:true
Paper color is:Green

Created Paper
Paper thickness is:2.5
Paper size is:L
Paper quality is:true
Paper color is:Pink
Created Paper
Paper thickness is:2.5
Paper size is:M
Paper quality is:true
Paper color is:Blue   */
