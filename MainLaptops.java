package Laptops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainLaptops {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop("HP", "Free DOS 3.0", 16, 512, "white");
        Laptop lp2 = new Laptop("Acer", "Windows 10", 16, 1024, "grey");
        Laptop lp3 = new Laptop("Lenovo", "Windows 11", 16, 512, "black");
        Laptop lp4 = new Laptop("HP", "Free DOS 3.0", 16, 512, "white");
        Laptop lp5 = new Laptop("Apple", "macOS", 8, 256, "grey");
        Laptop lp6 = new Laptop("Lenovo", "Windows 11", 16, 512, "black");

        // Set<Laptop> lps = new HashSet<>(Arrays.asList(lp1, lp2, lp3, lp4, lp5, lp6));

        // for (Laptop lp : lps) {
        //     System.out.println(lp);
        //     System.out.println();
        // }

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(lp1);
        laptops.add(lp2);
        laptops.add(lp3);
        laptops.add(lp4);
        laptops.add(lp5);
        laptops.add(lp6);

        Scanner scanner = new Scanner(System.in);

        Map<String, Object> criteria = new HashMap<>();

        System.out.println("Выберите критерий для фильтрации:");
        System.out.println("1 - Бренд ноутбука");        
        System.out.println("2 - ОЗУ");
        System.out.println("3 - Объём жёсткого диска");
        System.out.println("4 - Операционная система");
        System.out.println("5 - Цвет");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите желаемый бренд:");
                String brand = scanner.next();
                criteria.put("brand", brand);
                break;
            case 2:
                System.out.println("Введите минимальное значение ОЗУ:");
                int minRam = scanner.nextInt();
                criteria.put("ram", minRam);
                break;
            case 3:
                System.out.println("Введите минимальное значение объёма жесткого диска:");
                int minSizeHHD = scanner.nextInt();
                criteria.put("sizeHHD", minSizeHHD);
                break;
            case 4:
                System.out.println("Введите желаемую операционную систему:");
                String os = scanner.next();
                criteria.put("os", os);
                break;
            case 5:
                System.out.println("Введите желаемый цвет:");
                String color = scanner.next();
                criteria.put("color", color);
                break;
        }

        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.matchesCriteria(criteria)) {
                filteredLaptops.add(laptop);
            }
        }

        System.out.println("Подходящие ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println();
            System.out.println(laptop);
            System.out.println();
        }
    }
}
