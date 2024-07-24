class Task2{
	public static void main(String[] args){ 
		double distance = 5.83; // scope is from line 3 to 11
		char temp = 'C';
		{  // just to check the scope of the varibale
		distance = 6.01;
		temp = 'F';
		}
		System.out.println(distance);
		System.out.println(temp);
	}
}