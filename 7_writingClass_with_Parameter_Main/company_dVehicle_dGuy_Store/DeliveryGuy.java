class DeliveryGuy{
	public static void Give(String item, String location){
		
		System.out.println("running Give in DeliveryGuy with 2 string parameters and 1 is fixed cannot be changed further");
		DeliveryVehicle.deliver(item, "Bangalore");
	}
}