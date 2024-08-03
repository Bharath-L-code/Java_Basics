class BoardRunner {
    public static void main(String[] args) {
        Board board1 = new Board("Whiteboard", "Plastic", 2.0);
        System.out.println("Type: " + board1.type);
        System.out.println("Material: " + board1.material);
        System.out.println("Size: " + board1.size);

        Board board2 = new Board("Blackboard", "Wood", 2.5);
        System.out.println("Type: " + board2.type);
        System.out.println("Material: " + board2.material);
        System.out.println("Size: " + board2.size);

        Board board3 = new Board("Corkboard", "Cork", 1.5);
        System.out.println("Type: " + board3.type);
        System.out.println("Material: " + board3.material);
        System.out.println("Size: " + board3.size);

        Board board4 = new Board("Pinboard", "Fabric", 1.8);
        System.out.println("Type: " + board4.type);
        System.out.println("Material: " + board4.material);
        System.out.println("Size: " + board4.size);

        Board board5 = new Board("Magnetic Board", "Metal", 2.2);
        System.out.println("Type: " + board5.type);
        System.out.println("Material: " + board5.material);
        System.out.println("Size: " + board5.size);

        Board board6 = new Board("Glass Board", "Glass", 2.3);
        System.out.println("Type: " + board6.type);
        System.out.println("Material: " + board6.material);
        System.out.println("Size: " + board6.size);

        Board board7 = new Board("Chalkboard", "Slate", 2.0);
        System.out.println("Type: " + board7.type);
        System.out.println("Material: " + board7.material);
        System.out.println("Size: " + board7.size);

        Board board8 = new Board("Dry Erase Board", "Melamine", 2.1);
        System.out.println("Type: " + board8.type);
        System.out.println("Material: " + board8.material);
        System.out.println("Size: " + board8.size);

        Board board9 = new Board("Bulletin Board", "Cork", 1.7);
        System.out.println("Type: " + board9.type);
        System.out.println("Material: " + board9.material);
        System.out.println("Size: " + board9.size);

        Board board10 = new Board("Presentation Board", "Aluminum", 2.4);
        System.out.println("Type: " + board10.type);
        System.out.println("Material: " + board10.material);
        System.out.println("Size: " + board10.size);
    }
}