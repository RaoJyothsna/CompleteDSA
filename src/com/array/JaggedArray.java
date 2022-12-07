package com.array;

import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[5][];
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter column size : ");
            arr[i] = new int[scan.nextInt()];
        }

        for (int i =0 ;i < 5; i++)
        {
            System.out.println("Reading data for : " + i + " row ");

            for( int j = 0; j < arr[i].length; j++)
            {
                System.out.println("enter Data : ");
                arr[i][j] = scan.nextInt();
            }
        }

//        for(int values[] : arr)
//        {
//            for(int value : values)
//            {
//                System.out.println(value);
//            }
//        }

        for (int i =0 ;i < 5; i++)
        {
            System.out.println("Printing : " + i + " row ");
            for( int j = 0; j < arr[i].length; j++)
            {
                System.out.print(" "+ arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
