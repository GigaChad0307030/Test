package org.example;
import java.util.Scanner;  // Import the Scanner class
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Scrivi qualcosa:");
        String userName = myObj.nextLine();
        System.out.println("Qualcosa: " + userName);
    }
}
