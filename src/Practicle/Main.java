package Practicle;

import java.util.Scanner;

public class Main {
    public static Hotel[] hotels;

    public static void main(String[] args) {

        hotels = new Hotel[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("name = ");
            String name = scanner.next();
            System.out.print("location = ");
            String location = scanner.next();
            System.out.print("ownerName = ");
            String ownerName = scanner.next();
            hotels[i] = new Hotel(name, location, ownerName);
        }

        System.out.print("Enter owner name = ");
        String ownerName = scanner.next();


    }
}
