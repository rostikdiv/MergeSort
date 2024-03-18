package com.Coursework;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random(101);
        int[] arr=new int[10000];
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt();
        }
        int[] arr1=arr.clone();
        int[] arr2=arr.clone();

        int s=0,e=0,f=0;

        System.out.println("Sorting from smallest to largest started");
        s=(int)System.currentTimeMillis();
        Mergesort.mergeSort(arr1);
        e=(int)System.currentTimeMillis();
        f=e-s;

        System.out.println("sorting finished for "+f+" ms");

        System.out.println("Sorting from largest to smallest started ");
        s=(int)System.currentTimeMillis();
        Mergesort.mergeSortRev(arr2);
        e=(int)System.currentTimeMillis();
        f=e-s;

        System.out.println("sorting finished for "+f+" ms");

    }
}