class Led {
    String brand;
    int wattage;
    String colorTemperature;

    public Led(String brandLocal, int wattageLocal, String colorTemperatureLocal) {
        System.out.println("Created a Led with brand, wattage, color temperature");
        brand = brandLocal;
        wattage = wattageLocal;
        colorTemperature = colorTemperatureLocal;
    }
}
