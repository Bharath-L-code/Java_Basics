class Blade {
    
    String brand;
    double price;
    
    Blade(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("created Blade using string and double const......");
    }
    
    void details() {
        System.out.println("Blade_brand: " + brand);
        System.out.println("Blade_price: " + price);
    }
    
}

class Trimmer {
    
    String brand;
    Blade blade;
    
    /*Trimmer(String brand) 
	{
        this.brand = brand;
        this.blade = new Blade("Gillete", 30);
    }*/                                           // -----------> In Runner to get op we have not used this	
    
    Trimmer(String brand, Blade blade) 
	{
		
        this.brand = brand;
        this.blade = blade;
		System.out.println("creating Trimmer named Const using String and 'Blade' ");
    }
    
    public void display() {
        System.out.println("Trimmer_brand: " + brand);
        blade.details();
    }
    
}