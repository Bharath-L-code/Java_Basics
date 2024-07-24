class Buy {
    public static void product(String brand, double price) { // 1
        System.out.println("Running product in Buy");
        System.out.println("Brand: " + brand + ", Price: " + price);
		if(price<=1000){
			System.out.println("product purchased");
		}
		else{
			System.out.println("product not purchased");
		}
    }

    public static void product(String name, int quantity, String quantityText, double price) { // 2
        System.out.println("Running product in Buy");
        System.out.println("Name: " + name + ", Quantity: " + quantity + ", Quantity Text: " + quantityText + ", Price: " + price);
		if(quantity==1){
			System.out.println("buy product");
		}
		else{
			System.out.println("dont buy product");
		}
    }

    public static void bookMovieTicket(String name, String theatreName, int quantity, double price) { // 3
        System.out.println("Running bookMovieTicket in Buy");
        System.out.println("Name: " + name + ", Theatre Name: " + theatreName + ", Quantity: " + quantity + ", Price: " + price);
		if (quantity == 3 && price==200){
			System.out.println("confirm booking");
		}
		else{
			System.out.println("go bacck to menu");
		}
    }

    public static void buyEgg(int total, double pricePerEgg) { // 4
        System.out.println("Running buyEgg in Buy");
        System.out.println("Total: " + total + ", Price Per Egg: " + pricePerEgg);
		if(pricePerEgg>=100){
			System.out.println("buy egg");
		}
		else{
			System.out.println("dont buy egg");
		}
    }

    public static void buyShampoo(int quantityInMI, double price, String brand, String manfDate) { // 5
        System.out.println("Running buyShampoo in Buy");
        System.out.println("Quantity in ml: " + quantityInMI + ", Price: " + price + ", Brand: " + brand + ", Manufacturing Date: " + manfDate);
		if(price>=1000){
			System.out.println("buuy");
		}
		else{
			System.out.println("dont buy");
			
		}
    }

    public static void buyCake(char size, String type, String flavour, double cost, int quantity) { // 6
        System.out.println("Running buyCake in Buy");
        System.out.println("Size: " + size + ", Type: " + type + ", Flavour: " + flavour + ", Cost: " + cost + ", Quantity: " + quantity);
    }

    public static void Laptop(String brand, int serialNo, double price, int batteryCapacity, double screenSize, String os, int harddiskSize, int ramSize) { // 7
        System.out.println("Running Laptop in Buy");
        System.out.println("Brand: " + brand + ", Serial No: " + serialNo + ", Price: " + price + ", Battery Capacity: " + batteryCapacity + ", Screen Size: " + screenSize + ", OS: " + os + ", Hard Disk Size: " + harddiskSize + ", RAM Size: " + ramSize);
		if(price>=1000){
			System.out.println("buuy");
		}
		else{
			System.out.println("dont buy");
			
		}
    }
	

    public static void buySmartWatch(String brand, double price, char color, char type, int mode) { // 8
        System.out.println("Running buySmartWatch in Buy");
        System.out.println("Brand: " + brand + ", Price: " + price + ", Color: " + color + ", Type: " + type + ", Mode: " + mode);
		if(price>=1000){
			System.out.println("buuy");
		}
		else{
			System.out.println("dont buy");
			
		}
    }
}
