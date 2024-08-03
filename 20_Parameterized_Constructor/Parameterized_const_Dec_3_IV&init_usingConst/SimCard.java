class SimCard {
    String carrier;
    String type;
    double balance;

    public SimCard(String carrierLocal, String typeLocal, double balanceLocal) {
        System.out.println("Created a SimCard with carrier, type, balance");
        carrier = carrierLocal;
        type = typeLocal;
        balance = balanceLocal;
    }
}