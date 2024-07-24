class TrainRunner{
	public static void main(String[] args){
		Train.book("Bengaluru", "Mangalore");
		Train.book("mysuru","mandya",15);
		Train.book("mysuru","mandya",15,78900.67);
		Train.cancel(124);
		Train.cancel("Bengaluru", "Mangalore");
	}
}