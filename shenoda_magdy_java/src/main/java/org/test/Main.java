package org.test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Algorithm algorithm = new Algorithm();

        //there is a numeric array at the input, it is necessary to output the elements of the array that are multiples of 3


        System.out.println("input size ...");
        int[] myArr = new int[scanner.nextInt()];

        for (int i = 0; i < myArr.length; i++) {

            System.out.println("input array ...");
            myArr[i] = scanner.nextInt();

        }

        System.out.println(algorithm.numeric_array(myArr));


        // entered number is greater than 7, then output “Hi” if its las will get Number is <7

        System.out.println("input number greater than 7...");
        System.out.println(algorithm.greater_number(scanner.nextInt()));


        //ntered name matches Vyacheslav, then output “Hi, Vyacheslav”, if not, then output will be  “No such name”

        System.out.println("input Name Vyacheslav");
        System.out.println(algorithm.matches(scanner.next()));


        // [((())()(())]] Not correct


        // [[((()))()(())]]  correct one


    }
}