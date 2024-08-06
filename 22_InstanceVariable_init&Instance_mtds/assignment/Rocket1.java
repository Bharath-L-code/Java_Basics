class Rocket1 {
    String country = " "; // Using literals
    double speed = 0.0; // Using literals
    int fuelCapacity = 0; // Using literals
    int noOfThrusters = 0; // Using literals

    // Constructor
    Rocket1(String country, double speed, int fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }
	

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNoofThrusters(int noOfThrusters) {
        this.noOfThrusters = noOfThrusters;
    }

    void display() {
        System.out.println("Country: " + this.country);
        System.out.println("Speed: " + this.speed);
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
        System.out.println("Number of Thrusters: " + this.noOfThrusters);
    }

    public static void main(String[] args) {
        // Using constructor to initialize
        Rocket1 rocket1 = new Rocket1("USA", 500.0, 50, 4);
		System.out.println("Using constructor to initialize");
		System.out.println("-------------------------------");
        rocket1.display();
        System.out.println("========================================================");

        // Using instance methods to initialize
		
        Rocket1 rocket2 = new Rocket1("Unknown", 0.0, 0, 0);
		
		
        rocket2.setCountry("India");
        rocket2.setSpeed(200);
        rocket2.setFuelCapacity(25);
        rocket2.setNoofThrusters(10);
		
		System.out.println("Using instance methods to initialize");
		System.out.println("------------------------------------");
		
        System.out.println("Country Name: " + rocket2.country);
        System.out.println("Rocket Speed: " + rocket2.speed);
        System.out.println("Fuel Capacity: " + rocket2.fuelCapacity);
        System.out.println("Number of Thrusters: " + rocket2.noOfThrusters);
		
        System.out.println("========================================================");
		System.out.println("using setter mtd");
		System.out.println("------------------------------------");
        rocket2.display();
		System.out.println("========================================================");
        // Using reference to initialize another object
        Rocket1 rocket3 = rocket2;
		
		System.out.println("Using reference to initialize another object");
		System.out.println("------------------------------------");
		
        System.out.println("Country Name (rocket3): " + rocket3.country);
        System.out.println("Rocket Speed (rocket3): " + rocket3.speed);
        System.out.println("Fuel Capacity (rocket3): " + rocket3.fuelCapacity);
        System.out.println("Number of Thrusters (rocket3): " + rocket3.noOfThrusters);
		System.out.println("========================================================");
		
		
		Rocket1 rocket4 = new Rocket1("Russia", 800.0, 60, 14);
		System.out.println("Using constructor to initialize");
		System.out.println("-------------------------------");
        rocket4.display();
        System.out.println("========================================================");
		
		Rocket1 rocket5 = new Rocket1("Unknown", 0.0, 0, 0);
		
		
        rocket5.setCountry("japan");
        rocket5.setSpeed(400);
        rocket5.setFuelCapacity(35);
        rocket5.setNoofThrusters(20);
		
		System.out.println("Using instance methods to initialize");
		System.out.println("------------------------------------");
		
        System.out.println("Country Name: " + rocket5.country);
        System.out.println("Rocket Speed: " + rocket5.speed);
        System.out.println("Fuel Capacity: " + rocket5.fuelCapacity);
        System.out.println("Number of Thrusters: " + rocket5.noOfThrusters);
		
        System.out.println("========================================================");
		
    }
}





/*              output in CMD
Using constructor to initialize
-------------------------------
Country: USA
Speed: 500.0
Fuel Capacity: 50
Number of Thrusters: 4
========================================================
Using instance methods to initialize
------------------------------------
Country Name: India
Rocket Speed: 200.0
Fuel Capacity: 25
Number of Thrusters: 10
========================================================
using setter mtd
------------------------------------
Country: India
Speed: 200.0
Fuel Capacity: 25
Number of Thrusters: 10
========================================================
Using reference to initialize another object
------------------------------------
Country Name (rocket3): India
Rocket Speed (rocket3): 200.0
Fuel Capacity (rocket3): 25
Number of Thrusters (rocket3): 10
========================================================
Using constructor to initialize
-------------------------------
Country: Russia
Speed: 800.0
Fuel Capacity: 60
Number of Thrusters: 14
========================================================
Using instance methods to initialize
------------------------------------
Country Name: japan
Rocket Speed: 400.0
Fuel Capacity: 35
Number of Thrusters: 20
========================================================  */