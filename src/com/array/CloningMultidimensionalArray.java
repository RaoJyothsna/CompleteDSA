package com.array;

public class CloningMultidimensionalArray {


    public static void main(String[] args) {

        int originalArray[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int cloneCopy[][] = originalArray.clone();

        System.out.println(originalArray.toString());
        System.out.println(cloneCopy.toString());

        System.out.println("Printing Original Array");
        for (int oValues[] : originalArray)
        {
            for(int oVal : oValues)
                System.out.print(oVal+" ");
        }
        System.out.println("\n==========================");
        System.out.println("Printing Cloned Array");
        for (int cValues[] : cloneCopy)
        {
            for(int cVal : cValues)
            System.out.print(cVal+" ");
        }

        System.out.println("\n==========================");
        System.out.println("compare arrays  ");
        System.out.println(cloneCopy == originalArray);

        System.out.println("compare arrays  ");
        System.out.println(cloneCopy[0] == originalArray[0]);
    }

}
