package com.array;

import java.util.Scanner;

class Color
{
    String color;
    int id;

    public Color(String color,int i)
    {
        this.color = color;
        this.id = i;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}
public class ArrayOfObject {

    public static void main(String[] args) {

        // create Color class array

        Color[] colors_array = new Color[]{new Color("red",111),new Color("blue",155),new Color("green",999),new Color("white",655),new Color("black",000)};

        for(Color color : colors_array)
        {
            System.out.println(color);
        }
        Scanner scanner = new Scanner(System.in);

        Color[] colors = new Color[3];

        for(int i = 0; i < 3; i++)
        {
            String c = scanner.nextLine();
            colors[i] = new Color(c,i+100);
        }

        for(int i = 0; i < 3; i++)
        {
            System.out.println(colors[i]);
        }

    }
}
