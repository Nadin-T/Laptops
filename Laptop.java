package Laptops;

public class Laptop {
    private String brand;
    private String os;
    private int ram;
    private int sizeHHD;
    private String color;

    public Laptop(String brand, String os, int ram,
            int sizeHHD, String color) {
        this.brand = brand;
        this.os = os;
        this.ram = ram;
        this.sizeHHD = sizeHHD;
        this.color = color;
    }

    // get
    public String getBrand() {
        return brand;
    }

    public String getOS() {
        return os;
    }

    public int getRAM() {
        return ram;
    }

    public int getSizeHHD() {
        return sizeHHD;
    }

    public String getColor() {
        return color;
    }
}
