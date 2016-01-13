package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SortedArray sortedArray = new SortedArray();
        sortedArray.printArray();
        sortedArray.sortBubble();

        System.out.println();
        sortedArray.printArray();

        Random random = new Random();
        int x = random.nextInt(10);

        //System.out.println("X = " + x);
    }
}
