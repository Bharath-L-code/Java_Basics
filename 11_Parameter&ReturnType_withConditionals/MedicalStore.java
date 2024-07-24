class MedicalStore{
	public static double cost(String name){
		System.out.println("starting cost in MedicalStore");
		System.out.println("MedicineName: "+ name);
		
		if(name == "Evron_tablet")
		{
			return 5.00;
		}
		if(name == "Adderall_tablet")
		{
			return 15.00;
		}
		if(name == "Ativan_tablet")
		{
			return 25.00;
		}
		return 0.00;
	}
	public static String sympton(String name1){
		System.out.println("starting symptom in MedicalStore");
		System.out.println("Symptom Name: "+ name1);
		
		if(name1 == "Cough")
		{
			return "Evron_tablet";
		}
		if(name1 == "Headache")
		{
			return "Adderall_tablet";
		}
		if(name1 == "dizzyness")
		{
			return "Ativan_tablet";
		}
		return "Not known";
	}
	public static boolean avail(String docName){
		System.out.println("starting avail in MedicalStore");
		System.out.println("Doctor_Name: "+docName);
		
		if (docName == "Dr Ram")
		{
			return true;
		}
		if (docName == "Dr Raju")
		{
			return false;
		}
		if (docName == "Dr Ravi")
		{
			return true;
		}
		return false;
	}
}