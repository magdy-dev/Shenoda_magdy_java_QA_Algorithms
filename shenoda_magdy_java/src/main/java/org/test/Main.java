package org.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Integer value =0;
        
        Scanner scanner = new Scanner(System.in);
        Algorithm algorithm = new Algorithm();

        ArrayList<Integer>input1 = new ArrayList<>();

        while (value!=null){

            scanner.nextInt();


        }



        int [] input={1,2,3,4,5,6,7,8,9,10};

        System.out.println(algorithm.numeric_array(input));


        System.out.println("input number ...");
        System.out.println(algorithm.greater_number(scanner.nextInt()));

        System.out.println("input Name");
        System.out.println(algorithm.matches(scanner.next()));


        // [((())()(())]] Not correct


        // [[((()))()(())]]  correct one


    }
}