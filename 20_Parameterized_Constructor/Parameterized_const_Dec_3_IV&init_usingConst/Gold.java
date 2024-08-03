class Gold {
    String purity;
    double weight;
    double pricePerGram;

    public Gold(String purityLocal, double weightLocal, double pricePerGramLocal) {
        System.out.println("Created a Gold with purity, weight, price per gram");
        purity = purityLocal;
        weight = weightLocal;
        pricePerGram = pricePerGramLocal;
    }
}