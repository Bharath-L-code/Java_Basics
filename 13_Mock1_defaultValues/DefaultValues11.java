public class DefaultValues11 {

    
	
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    static boolean booleanVar;

    public static void main(String[] args) {
       
        System.out.println("Default values of primitive types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: [" + charVar + "]"); // char will be printed as an empty space
        System.out.println("boolean: " + booleanVar);
    }
}