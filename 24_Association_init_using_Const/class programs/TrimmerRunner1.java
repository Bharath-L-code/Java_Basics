class TrimmerRunner1 {
    
    public static void main(String[] args) {
        Blade blade = new Blade("7 o Clock", 20);
        Trimmer trimmer = new Trimmer("Philips", blade);
        trimmer.display();
        System.out.println("===============================================");
        
        Blade blade1 = new Blade("LaserUltra", 10);
        Trimmer trimmer1 = new Trimmer("Panasonic", blade1);
        trimmer1.display();
        System.out.println("===============================================");
        
        Blade blade2 = new Blade("SuperMax", 40);
        Trimmer trimmer2 = new Trimmer("MI", blade2);
        trimmer2.display();
        System.out.println("===============================================");
    }
    
}



/*    op

created Blade using string and double const......
creating Trimmer named Const using String and 'Blade'
Trimmer_brand: Philips
Blade_brand: 7 o Clock
Blade_price: 20.0
===============================================
created Blade using string and double const......
creating Trimmer named Const using String and 'Blade'
Trimmer_brand: Panasonic
Blade_brand: LaserUltra
Blade_price: 10.0
===============================================
created Blade using string and double const......
creating Trimmer named Const using String and 'Blade'
Trimmer_brand: MI
Blade_brand: SuperMax
Blade_price: 40.0
===============================================


*/