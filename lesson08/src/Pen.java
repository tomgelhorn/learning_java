public class Pen {
    private String brand;
    private String type;

    public Pen(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Pen by " + brand + " is type: " + type;
    }
}
