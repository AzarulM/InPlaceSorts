package com.company;

public class InPlaceSorts {

    public static void swapInt(int[] arr, int i, int j)
    {
        int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
    }
    public static void swapDouble(double[] arr, int i, int j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapString(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


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
        for(int i = 0; i < list1.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j<list1.length; j++)
            {
                if(list1[j] < list1[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                swapDouble(list1, i, min);
            }

        }
    }

    public static void bubbleSort(String[] list1)
    {
        for (int i = 0; i < list1.length; i++)
        {
            for (int j = 0; j < list1.length - i - 1; j++) {
                if (list1[j].compareTo(list1[j+1]) > 0) {
                    swapString(list1, j, j + 1);
                }
            }
        }
    }


    public static String[] randomStringArr(int num, int length)
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

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.random()*10000.0;
        }
        return arr;
    }

    public void mergeSort (int[] arr)
    {
        int n = arr.length;
        int [] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    public void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid + 1, right, temp);
        }
    }

    public void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        
    }
}
