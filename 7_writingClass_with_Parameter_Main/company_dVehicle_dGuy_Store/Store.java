class Store{
	public static void main(String[] args){
		
		System.out.println("running main in Store");
		
	   DeliveryGuy.Give("table", "Bangalore");
	   DeliveryVehicle.deliver("chair", "Bangalore");
	   Company.deliver("box", "mandya");
	   
	}
}