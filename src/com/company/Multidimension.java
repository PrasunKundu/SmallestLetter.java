package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
      /*
      1 2 3
      4 5 6
      7 8 9

       */
        Scanner in = new Scanner(System.in);

        //  int[][] arr = new int[3][];

        //   int[][] arr2D = {
        //          {1, 2, 3}
        //   };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // rows
        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr.length ; col++) {
                arr[row][col] = in.nextInt();

            }

        }
        // output
        for (int[] a : arr) {
            // foreach col in every row
           // for (int col = 0; col < arr.length; col++) {
             //   System.out.print(ints[col] + " ");

          //  }
           // System.out.println();
            System.out.println(Arrays.toString(a));

        }
    }
}
