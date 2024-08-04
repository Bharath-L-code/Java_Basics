class Mask{
	double cost;
	char size;
	String material;


	Mask(){
	System.out.println("Constructor with no parameter");
	System.out.println("-----------------------");
	}

	Mask(double cost){
	this.cost=cost;
	System.out.println("Cost of the mask:"+cost);
	System.out.println("Constructor to init cost");
	System.out.println("-----------------------");

	}

	Mask(char size){
	this.size=size;
	System.out.println("Size of the mask:"+size);
	System.out.println("Constructor to init size");
	System.out.println("-----------------------");

	}

	Mask(String  material){
	this.material=material;
	System.out.println("Material of the mask:"+material);
	System.out.println("Constructor to init material");
	System.out.println("-----------------------");

	}

	Mask(double cost,char size,String  material){
	this.cost=cost;
	this.size=size;
	this.material=material;
	System.out.println("Cost of the mask:"+cost);
	System.out.println("Size of the mask:"+size);
	System.out.println("Material of the mask:"+material);
	System.out.println("Constructor to init cost ,size and material");
	System.out.println("-----------------------");

	}

	Mask(double cost,char size){
	this.cost=cost;
	this.size=size;
	System.out.println("Cost of the mask:"+cost);
	System.out.println("Size of the mask:"+size);
	System.out.println("Constructor to init cost and size");
	System.out.println("-----------------------");
	
	}
	
}
/*No parameter const
Constructor to init cost
Constructor to init size
Constructor to init material
Constructor to init cost ,size and material
Constructor to init cost and size*/

class Kerosene{
	double price;
	int quantity;
	boolean quality;
	
	Kerosene(){
		System.out.println("Constructor with no parameter");
	}
	
	Kerosene(double price,int quantity,boolean quality){
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
		System.out.println("Quality of Kerosene:"+quality);
		System.out.println("Quantity of Kerosene:"+quantity);
		System.out.println("Price of Kerosene:"+price);
		System.out.println("Constructor to init price,quantity and quality");
		System.out.println("-----------------------");
		
	}
	
	Kerosene(boolean quality){
		this.quality=quality;
		System.out.println("Quality of Kerosene:"+quality);
		System.out.println("Constructor to init quality");
		System.out.println("-----------------------");
	
	}
	
	Kerosene(double price){
		this.price=price;
		System.out.println("Price of Kerosene:"+price);
		System.out.println("Constructor to init price");
		System.out.println("-----------------------");
		
	}
}
	
/*No Parameter const
Constructor to init price,quantity and quality
Constructor to init quality
Constructor to init price*/


class Aeroplane{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	
	Aeroplane(){
		System.out.println("Constructor with no parameter");
	}
	
	Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination){
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("Aeroplane Company:"+company);
		System.out.println("Number of seats:"+noOfSeats);
		System.out.println("Ticket Price:"+ticketPrice);
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Constructor to init all instance variables");
		System.out.println("-----------------------");
		
		
	}
	
	Aeroplane(String company,String source,String destination){
		this.company=company;
		this.source=source;
		this.destination=destination;
		System.out.println("Aeroplane Company:"+company);
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Constructor to init company,source,destination");
		System.out.println("-----------------------");
	}
	
	Aeroplane(String company,double ticketPrice,String source,String destination){
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("Aeroplane Company:"+company);
		System.out.println("Ticket Price:"+ticketPrice);
		System.out.println("Source:"+source);
		System.out.println("Destination:"+destination);
		System.out.println("Constructor to init company,ticketPrice,source,destination");
		System.out.println("-----------------------");
	}
	
}
/*No Parameter const
Constructor to init all instance variables
Constructor to init company,source,destination
Constructor to init company,ticketPrice,source,destination */
