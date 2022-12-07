package com.array;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // declaring and initializing 3*3 array

        int[][] matrix = new int[3][3];

        //insert value

        matrix[0][0] = 10;

        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrix[i][j] = 100+j+i;
            }
        }

        for (int v[] : matrix)
        {
            for( int data :v)
            {
                System.out.println(data);
            }
        }
    }
}
