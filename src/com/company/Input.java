package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 54;
        arr[2] = 60;
        arr[3] = 87;
        arr[4] = 90;
        System.out.println(arr[3]);
        // Input using for loop
       for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
        }
      System.out.println(Arrays.toString(arr));

    //    for (int i = 0; i < arr.length; i++) {
      //      System.out.println(arr[i] + " ");
      //  }
       // for (int num : arr) { // for element in array , print the element
       //     System.out.println(num + " ");// here num represents element

    //    }
        // array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
            
        }
        System.out.println(Arrays.toString(str));
    }
}
