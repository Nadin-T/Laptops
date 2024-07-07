package Laptops;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainLaptops {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop("HP", "Free DOS 3.0", 16, 512, "white");
        Laptop lp2 = new Laptop("Acer", "Windows 10", 16, 1024, "grey");
        Laptop lp3 = new Laptop("Lenovo", "Windows 11", 16, 512, "black");
        Laptop lp4 = new Laptop("HP", "Free DOS 3.0", 16, 512, "white");
        Laptop lp5 = new Laptop("Apple", "macOS", 8, 256, "grey");
        Laptop lp6 = new Laptop("Lenovo", "Windows 11", 16, 512, "black");

        Set<Laptop> lps = new HashSet<>(Arrays.asList(lp1, lp2, lp3, lp4, lp5, lp6));

        for (Laptop lp : lps) {
            System.out.println(lp);
            System.out.println();
        }
    }
}
