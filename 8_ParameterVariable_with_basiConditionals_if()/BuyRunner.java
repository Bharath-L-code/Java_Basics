class BuyRunner {
    public static void main(String[] args) {
        Buy.product("Gucci", 600.67);
        Buy.product("Reymond", 9000.098);

        Buy.product("h&m", 5, "five", 700.67);
         Buy.product("shirt", 10, "six", 10.787);

        Buy.bookMovieTicket("kotee","Navrang", 5, 200.00);
         Buy.bookMovieTicket("Kalki","Govardhan",  4, 100.00);

        Buy.buyEgg(10, 70.04);
         Buy.buyEgg(5, 35.008);

        Buy.buyShampoo(10, 12.08, "sunsilk", "01/05/24");
        Buy.buyShampoo(110, 121.08, "moonsilk", "02/05/24");

        Buy.buyCake('m', "honey", "chocolate", 500.05, 1);
         Buy.buyCake('l', "puff", "strawberry", 600.05, 2);

        Buy.Laptop("Lenovo", 456345, 45.0000, 4000, 32.55, "windows", 512, 16);
         Buy.Laptop("Hp", 556345, 60.0000, 3000, 42.55, "macos", 512, 8);

        Buy.buySmartWatch("samsung", 500.55, 'r', 'm', 8);
        Buy.buySmartWatch("apple", 600.55, 'b', 'l', 81);
    }
}