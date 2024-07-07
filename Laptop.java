package Laptops;

import java.util.Objects;

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

    @Override
    public String toString() {
        String result = "Бренд ноутбука: " + brand + System.lineSeparator()
                + "Операционная система: " + os + System.lineSeparator()
                + "ОЗУ: " + ram + System.lineSeparator()
                + "Объем жёсткого диска: " + sizeHHD + System.lineSeparator()
                + "Цвет: " + color;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
            return false;

        Laptop lp = (Laptop) obj;

        return brand.equals(lp.brand) && os.equals(lp.os) && ram == lp.ram
        && sizeHHD == lp.sizeHHD && color.equals(lp.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, os, ram, sizeHHD, color);
    }
}
