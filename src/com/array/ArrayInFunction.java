package com.array;

public class ArrayInFunction {
public static int[] createArray(int size)
{
    int arr[] = new int[size];
    for(int i = 0; i < size; i++)
    {
        arr[i] = i+100;
    }

    return arr;
}

public static void readArray(int arr[])
{
    for(int a : arr)
    {
        System.out.println(a);
    }
}

    public static void main(String[] args) {
        int orginalArr[] = createArray(10);
        readArray(orginalArr);
    }
}

