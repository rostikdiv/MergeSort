package com.Coursework;

import java.util.Arrays;

public class Mergesort {
    // сортування злиттям
    public static void mergeSort(int[] arr){
        if(arr.length==1){
            return;
        }
        int mid=arr.length/2;
        int[] l= Arrays.copyOfRange(arr,0,mid);
        int[] r= Arrays.copyOfRange(arr,mid,arr.length);


        mergeSort(l);
        mergeSort(r);
        merge(arr,l,r);
    }
    public static void merge(int[] arr,int[] left,int[] right){
        int l=0;
        int r=0;
        int idx=0;

        while(l<left.length && r<right.length){
            if(left[l]<right[r]){
                arr[idx++]=left[l++];
            }else{
                arr[idx++]=right[r++];
            }
        }

        for (int tail=l;tail<left.length;tail++){
            arr[idx++]=left[tail];
        }
        for (int tail=r;tail<right.length;tail++){
            arr[idx++]=right[tail];
        }
    }

    public static void mergeSortRev(int[] arr){
        if(arr.length==1){
            return;
        }
        int mid=arr.length/2;
        int[] l= Arrays.copyOfRange(arr,0,mid);
        int[] r= Arrays.copyOfRange(arr,mid,arr.length);

        mergeSortRev(l);
        mergeSortRev(r);
        mergeRev(arr,l,r);
    }
    public static void mergeRev(int[] arr,int[] left,int[] right){
        int l=0;
        int r=0;
        int idx=0;

        while(l<left.length && r<right.length){
            if(left[l]>right[r]){
                arr[idx++]=left[l++];
            }else{
                arr[idx++]=right[r++];
            }
        }

        for (int tail=l;tail<left.length;tail++){
            arr[idx++]=left[tail];
        }
        for (int tail=r;tail<right.length;tail++){
            arr[idx++]=right[tail];
        }
    }
}
