class Board {
    String type;
    String material;
    double size;

    public Board(String typeLocal, String materialLocal, double sizeLocal) {
        System.out.println("Created a Board with type, material, size");
        type = typeLocal;
        material = materialLocal;
        size = sizeLocal;
    }
}