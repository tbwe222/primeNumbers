package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int lastNumber = scan.nextInt();

        for (int i = 1; i <= lastNumber; i++) {

            if (lastNumber/i % i == 0) {
                System.out.println(i + " is a prime number");
            }
            else {
                System.out.println(i + " is not a prime number");
            }
        }
    }
}
