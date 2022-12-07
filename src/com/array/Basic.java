package com.array;

public class Basic {

    public static void main(String[] args) {

        //declaration

        int arr[];

        //initialization
        // arr is initialized with length/size 10

        arr = new int[10];

        // declaring and initialization

        float A[] = {1.1f,2.5f,3.0f,4.0f,5.0f};

        char B[] = new char[5];

        boolean C[] = new boolean[]{true,false,true,true};

        //inserting value using index

        arr[0] = 1;
        arr[1] = 10;

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = i+10;
        }

        //accessing array element

        System.out.println(arr[0]+"  "+arr[6]);
        System.out.println("===================================");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("===================================");

        //using foreach loop

        for(int value : arr)
        {
            System.out.println(value);
        }


    }
}
