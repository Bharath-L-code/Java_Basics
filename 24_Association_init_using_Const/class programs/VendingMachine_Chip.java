class Chip {
    
    String name;
    double price;
    
    Chip(String name, double price) {                         // to init Iv during creation
        System.out.println("created Chip using 2 Const");
        this.name = name;
        this.price = price;
    }
    
    public void Show() {                                     // access by Instance mtd
        System.out.println("Chips_Name: " + this.name);
        System.out.println("Chips_Price: " + this.price);
    }
        
}

class VendingMachine {
	
	//Chip chip = new Chip("Lays", 20);  // class level
    
    public void PrintMadu() {
        System.out.println("starting......");
        Chip chip = new Chip("Lays", 20);    // mtd level
        chip.Show();
        System.out.println("ending......");
    }
    
}  



/*

created Chip using 2 Const   ---------this comes here only once if *Chip chip = new Chip("Lays", 20);* is declared within class level but for mtd level for all three it gets printed
starting......
Chips_Name: Lays
Chips_Price: 20.0
ending......
===============================
starting......
Chips_Name: Lays
Chips_Price: 20.0
ending......
===============================
starting......
Chips_Name: Lays
Chips_Price: 20.0
ending......
===============================
