package com.trainee;

import java.util.Objects;

public class Algorithm {

    public int numeric_array(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                counter++;
            }
        }

        return counter;
    }


    public String matches(String name) {
        String outPut = "Hi";
        String outPut2 = "No such name";
        if (Objects.equals(name, "Vyacheslav")) {

            return outPut + " " + name;
        } else {
            return outPut2;
        }
    }


    public String greater_number(int number) {
        String result = "HI";
        if (number >= 7) {
            return result;

        } else {
            return "Number is <7";
        }
    }
}
