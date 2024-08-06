
class Battery {
    
    int capacity;
    
    // constructor 1
    Battery()
	{
        System.out.println("created Battery using no args");
    }
    
    // constructor 2
    Battery(int capacity) 
	{
        this.capacity = capacity;
        System.out.println("created Battery with one arg int");
    }
}

class Airpod {
    
    String brand = "Boat";
    Battery battery = new Battery(3000);
    
    // constructor
    Airpod() 
	{
        System.out.println("created Airpod with no args");
    }
    
    public void show() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("Battery Capacity: " + battery.capacity);
    }
}


