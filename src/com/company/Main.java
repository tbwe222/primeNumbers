package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int lastNumber = scan.nextInt();

        for (int i = 1; i <= lastNumber; i++) {
            if (lastNumber % i/2 == 0) {
                System.out.println(i + " is a prime number");
            }
            else {
                System.out.println(i + " is not a prime number");
            }
        }
    }
}
