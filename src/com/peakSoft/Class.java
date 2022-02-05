package com.peakSoft;

import java.util.Arrays;

public class Class {
   int number;
   String word;
   int[] array;

   public Class() {

   }

    public Class(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public void infoClass() {
        System.out.println("Number is: " + number);
        System.out.println("Word is: " + word);
        System.out.println("Array element are: " + Arrays.toString(array));

    }
}
