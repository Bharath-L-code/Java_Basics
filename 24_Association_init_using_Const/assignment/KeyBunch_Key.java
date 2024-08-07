class Key {
    
    int weight;
    String brand;
    
    Key(int weight, String brand) {
        this.weight = weight;
        this.brand = brand;
        System.out.println("created Key with int and String");
    }
    
    void show() {
        System.out.println("Key_weight: " + weight);
        System.out.println("Key_brand: " + brand);
    }
}

class KeyBunch {
    
    String material;
    Key key;
    
    KeyBunch(String material, Key key) {
        this.material = material;
        this.key = key;
        System.out.println("created KeyBunch with String and Key");
    }
    
    public void display() {
        System.out.println("KeyBunch_material: " + material);
        key.show();
    }
}