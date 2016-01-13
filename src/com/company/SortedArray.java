package com.company;

import java.util.Random;

public class SortedArray {

    private Integer integerArray[];

    private void createArray(int arraySize) {
        integerArray = new Integer[arraySize];

        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            integerArray[i] = random.nextInt(100);
        }
    }

    public SortedArray() {
        this(10);
    }

    public SortedArray(int arraySize) {
        createArray(arraySize);
    }

    public int getArraySize() {
        return integerArray.length;
    }

    public void printArray() {
        for (int i = 0; i < getArraySize(); i++) {
            System.out.print(integerArray[i] + " ");
        }
    }

    private void changePlace(int indexA, int indexB) {
        int tempInteger = integerArray[indexA];
        integerArray[indexA] = integerArray[indexB];
        integerArray[indexB] = tempInteger;
    }

    public void sortBubble() {
        for (int j = 1; j < getArraySize(); j++) {
            for (int i = 0; i < (getArraySize() - j); i++) {
                if (integerArray[i] > integerArray[i + 1])
                    changePlace(i, i + 1);
            }
        }
    }
}
