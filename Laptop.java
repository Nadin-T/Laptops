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

    // set
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public void setSizeHHD(int sizeHHD) {
        this.sizeHHD = sizeHHD;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
