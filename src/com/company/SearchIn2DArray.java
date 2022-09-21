package com.company;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 45, 66, 7},
                {23, 54, 62, 6, 89},
                {60, 50, 30, 90, 10, 32},
                {21, 45}
        };
        int target = 50;
        int[] ans = search(arr, target); // fornmat of return value {row , col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};

                }
            }


        }
        return new int[]{-1, -1};
    }
}