class MaliniRunner{
	
	public static void main(String[] args)
	{
		
	Clip clip = new Clip("Blue", "Paper_clip");
	Malini malini = new Malini("idontknow@gmail.com", clip);
	malini.display();
	System.out.println("=======================================");
	
	Clip clip1 = new Clip("Green", "Hair_Clip");
	Malini malini1 = new Malini("xshsghsga@gmail.com", clip1);
	malini1.display();
	System.out.println("=======================================");
	
	Clip clip2 = new Clip("White", "Vedio_Clip");
	Malini malini2 = new Malini("shbahsgsdvs@gmail.com", clip2);
	malini2.display();
	System.out.println("=======================================");
	}
}



/*     op

Created Clip using 2 strings
Created Clip using string and clip
Malini_Email: idontknow@gmail.com
Clip_Colour: Blue
Clip_Type: Paper_clip
=======================================
Created Clip using 2 strings
Created Clip using string and clip
Malini_Email: xshsghsga@gmail.com
Clip_Colour: Green
Clip_Type: Hair_Clip
=======================================
Created Clip using 2 strings
Created Clip using string and clip
Malini_Email: shbahsgsdvs@gmail.com
Clip_Colour: White
Clip_Type: Vedio_Clip
=======================================


*/