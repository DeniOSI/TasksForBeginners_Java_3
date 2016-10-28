package com.Tasks;

import java.util.Scanner;

/**
 * Created by Osipenko on 28.10.2016.
 */
public class NumberToArray {
    private int number;
    public NumberToArray(int number)
    {
        this.number = number;
    }

    private int[] NumToArr()
    {
        int[] arr;

        String strNum = Integer.toString(number);
        arr = new int[strNum.length()];
        for(int i= 0; i<strNum.length(); i++) {
            arr[i] = Character.getNumericValue(strNum.charAt(i));
        }
        return arr;
    }
    public void Print()
    {
        for (Object value: NumToArr())
        {
            System.out.print(value + "|");

        }
    }
}
