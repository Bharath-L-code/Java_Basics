class MkApRunner{
	
	public static void main(String[] args){
		
		Mask mask = new Mask();
		Mask mask1 = new Mask(40);
		Mask mask2 = new Mask('L');
		Mask mask3 = new Mask("Polypropylene");
		Mask mask4 = new Mask(50,'M',"Polypropylene");
		Mask mask5 = new Mask(30,'S');
		
		System.out.println("=======================");
		
		Kerosene kerosene = new Kerosene();
		Kerosene kerosene1 = new Kerosene(60,2,true);
		Kerosene kerosene2 = new Kerosene(false);
		Kerosene kerosene3 = new Kerosene(30);

		System.out.println("=======================");
		
		Aeroplane aeroplane = new Aeroplane();
		Aeroplane aeroplane1 = new Aeroplane("Qatar Airways",2,650250.255,"Bengaluru","USA");
		Aeroplane aeroplane2 = new Aeroplane("Etihad Airways","Bengaluru","Abu Dhabi");
		Aeroplane aeroplane3 = new Aeroplane("Air India",5800,"Bengaluru","Mumbai");

		System.out.println("=======================");
		
		
	}
}

/* 
Constructor with no parameter
-----------------------
Cost of the mask:40.0
Constructor to init cost
-----------------------
Size of the mask:L
Constructor to init size
-----------------------
Material of the mask:Polypropylene
Constructor to init material
-----------------------
Cost of the mask:50.0
Size of the mask:M
Material of the mask:Polypropylene
Constructor to init cost ,size and material
-----------------------
Cost of the mask:30.0
Size of the mask:S
Constructor to init cost and size
-----------------------
=======================
Constructor with no parameter
Quality of Kerosene:true
Quantity of Kerosene:2
Price of Kerosene:60.0
Constructor to init price,quantity and quality
-----------------------
Quality of Kerosene:false
Constructor to init quality
-----------------------
Price of Kerosene:30.0
Constructor to init price
-----------------------
=======================
Constructor with no parameter
Aeroplane Company:Qatar Airways
Number of seats:2
Ticket Price:650250.255
Source:Bengaluru
Destination:USA
Constructor to init all instance variables
-----------------------
Aeroplane Company:Etihad Airways
Source:Bengaluru
Destination:Abu Dhabi
Constructor to init company,source,destination
-----------------------
Aeroplane Company:Air India
Ticket Price:5800.0
Source:Bengaluru
Destination:Mumbai
Constructor to init company,ticketPrice,source,destination
-----------------------
======================= */