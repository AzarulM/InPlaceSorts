package com.company;

import java.util.Arrays;

public class InPlaceSorts {

    public static void insertionSort(int[] list1)
    {
        for (int i = 0; i < list1.length; i ++)
        {
            int mainValue = list1[i];
            int j = i - 1;

            while (j>=0 && list1[j] > mainValue)
            {
                list1[j + 1] = list1[j];
                j = j - 1;
            }
            list1[j + 1] = mainValue;
        }
    }
    public static void selectionSort(double[] list1)
    {
        
    }
    public static void bubbleSort(String[] list1)
    {

    }

    public String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while (num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num --;
            arr[num] = s;
        }
        return arr;
    }
}
