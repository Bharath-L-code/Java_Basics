class KeyBunchRunner1 {
    
    public static void main(String[] args) 
	{
        Key key = new Key(20, "Jackson_Keys");
        KeyBunch keyBunch = new KeyBunch("Iron", key);
        keyBunch.display();
        System.out.println("=============================");
		
		Key key1 = new Key(20, "Godrej_keys");
        KeyBunch keyBunch1 = new KeyBunch("Steel", key1);
        keyBunch1.display();
        System.out.println("=============================");
		
		Key key2 = new Key(20, "German_locks");
        KeyBunch keyBunch2 = new KeyBunch("Fiber", key2);
        keyBunch2.display();
        System.out.println("=============================");
    }
}



/*    op

created Key with int and String
created KeyBunch with String and Key
KeyBunch_material: Iron
Key_weight: 20
Key_brand: Jackson_Keys
=============================
created Key with int and String
created KeyBunch with String and Key
KeyBunch_material: Steel
Key_weight: 20
Key_brand: Godrej_keys
=============================
created Key with int and String
created KeyBunch with String and Key
KeyBunch_material: Fiber
Key_weight: 20
Key_brand: German_locks
=============================

*/