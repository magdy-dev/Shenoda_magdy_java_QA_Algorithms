package org.test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Algorithm algorithm = new Algorithm();

        //Task 1- numeric array, numbers divided into 3 are output


        System.out.println("Input size of array ...");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Input number ...");
            array[i] = scanner.nextInt();

        }

        System.out.println("Element of array divided into 3:");
        algorithm.numeric_array(array);


        //Task 2- entered number is greater than 7, then output “Hi” if its less - user will get 'number is <7'

        System.out.println("Input number greater than 7...");
        System.out.println(algorithm.greater_number(scanner.nextInt()));


        //Task 3 - entered name matches Vyacheslav, then output “Hi, Vyacheslav”, if not, then output will be  “No such name”

        System.out.println("Input name 'Vyacheslav'");
        System.out.println(algorithm.matches(scanner.next()));


        /*
        Task 4
        [((())()(())]] Not correct
        [[((()))()(())]]  correct one
        */


    }
}