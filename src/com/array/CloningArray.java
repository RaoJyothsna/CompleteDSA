package com.array;

public class CloningArray {

    public static void main(String[] args) {

        int originalArray[] = {1,2,3,4,5};
        int cloneCopy[] = originalArray.clone();

        System.out.println(originalArray.toString());
        System.out.println(cloneCopy.toString());

        System.out.println("Printing Original Array");
        for (int oValue : originalArray)
        {
            System.out.print(oValue+" ");
        }
        System.out.println("\n==========================");
        System.out.println("Printing Cloned Array");
        for (int cValue : cloneCopy)
        {
            System.out.print(cValue+" ");
        }

        System.out.println("\n==========================");
        System.out.println("compare arrays  ");
        System.out.println(cloneCopy == originalArray);
    }
}
