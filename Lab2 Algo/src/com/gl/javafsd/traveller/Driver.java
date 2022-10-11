package com.gl.javafsd.traveller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of Currency notes in your country");
        int size = sc.nextInt();

        int currency[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Currency Denomination " + i);
            currency[i] = sc.nextInt();
        }
        System.out.println("Before" + Arrays.toString(currency));
        BubbleSort bs = new BubbleSort();
        bs.sort(currency);
        System.out.println("After" + Arrays.toString(currency));


        System.out.println("Please enter How much payment u need to make");
        int amount = sc.nextInt();

        NotesCount nc = new NotesCount();
        nc.counting(currency, amount);

    }

}