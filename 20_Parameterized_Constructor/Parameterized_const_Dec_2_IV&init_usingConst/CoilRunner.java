class CoilRunner {
    public static void main(String[] args) {
        Coil coil1 = new Coil("Kanthal", "1.0 ohm");
        System.out.println("Type: " + coil1.type);
        System.out.println("Resistance: " + coil1.resistance);

        Coil coil2 = new Coil("Nichrome", "0.5 ohm");
        System.out.println("Type: " + coil2.type);
        System.out.println("Resistance: " + coil2.resistance);

        Coil coil3 = new Coil("Stainless Steel", "0.8 ohm");
        System.out.println("Type: " + coil3.type);
        System.out.println("Resistance: " + coil3.resistance);

        Coil coil4 = new Coil("Titanium", "1.2 ohm");
        System.out.println("Type: " + coil4.type);
        System.out.println("Resistance: " + coil4.resistance);

        Coil coil5 = new Coil("Ni200", "0.2 ohm");
        System.out.println("Type: " + coil5.type);
        System.out.println("Resistance: " + coil5.resistance);

        Coil coil6 = new Coil("Clapton", "0.3 ohm");
        System.out.println("Type: " + coil6.type);
        System.out.println("Resistance: " + coil6.resistance);

        Coil coil7 = new Coil("Alien", "0.15 ohm");
        System.out.println("Type: " + coil7.type);
        System.out.println("Resistance: " + coil7.resistance);

        Coil coil8 = new Coil("Fused Clapton", "0.4 ohm");
        System.out.println("Type: " + coil8.type);
        System.out.println("Resistance: " + coil8.resistance);

        Coil coil9 = new Coil("Juggernaut", "0.25 ohm");
        System.out.println("Type: " + coil9.type);
        System.out.println("Resistance: " + coil9.resistance);

        Coil coil10 = new Coil("Super Clapton", "0.7 ohm");
        System.out.println("Type: " + coil10.type);
        System.out.println("Resistance: " + coil10.resistance);
    }
}