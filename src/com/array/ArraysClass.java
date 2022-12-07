package com.array;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {
    public static void asListFun()
    {
        Integer arr[] = {1,2,3,4,5};

        //convert Array to list

        //Which returns fixed size list and

        //exception List<Integer> list = arr;
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        list.add(30);  // will get .UnsupportedOperationException
        System.out.println(list);

    }

    public static void binarySearchAlgo()
    {
        // This methods search for the specified element in the array with the help of the binary search algorithm.
        System.out.println("Use sorted array for Binary search\n");
        Integer arr[] = {2,3,5,11,34,55,67,88};

        for(int a: arr)
            System.out.print(a+" ");

        System.out.println("\nReturns -1 if key not found else return index of an element \n "+ Arrays.binarySearch(arr,1));

        System.out.println("Returns -1 if key not found else return index of an element \n "+ Arrays.binarySearch(arr,11));
    }

    public static void binarySearchAlgo2()
    {
        // This methods search for the specified element in the array with the help of the binary search algorithm.
        System.out.println("unsorted array for Binary search will return negative index of an array \n");
        Integer arr[] = {2,3,5,11,34,55,67,88};

        for(int a: arr)
            System.out.print(a+" ");

        System.out.println("\nReturns -1 if key not found else return index of an element \n "+ Arrays.binarySearch(arr,0,3,1));

        System.out.println("Returns -1 if key not found else return index of an element with negative sign\n "+ Arrays.binarySearch(arr,0,5,11));
        System.out.println("Returns -1 if key not found else return index of an element with negative sign\n "+ Arrays.binarySearch(arr,0,3,11));
    }

    public static boolean compareArray(int arr1[],int arr2[])
    {
        return Arrays.equals(arr1,arr2);
    }

   public static int[] copyOfArray(int oldArray[],int newSize)
   {
       int newArray[] = Arrays.copyOf(oldArray,newSize);
       return newArray;
   }

    public static void main(String[] args) {
        System.out.println(compareArray(new int[]{1,2,3,4,5},new int[]{1,2,3,4}));

        int A[] = {1,2,3,4,5};
        System.out.println("Old Array length : "+A.length);
        A = copyOfArray(A,10);
        System.out.println("New Array length : "+A.length);
    }
}
