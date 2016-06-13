package com.playtika.at;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ykhodos on 6/8/2016.
 */
public class HW2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new Random().ints(200, 1, 51).toArray();
       System.out.println("?");
      //  String isAsc = in.next();
       bubbleSort(arr,false);
    }

    public static void bubbleSort(int[] arr, boolean isAsc) {
        if (isAsc){
            for (int i = arr.length-1; i >=0; i--){
                for (int j = 0; j<i; j++){
                    if (arr[j]> arr[j+1]){
                        int t = arr[j];
                        //тут на место 1го ставится 2й
                        arr[j] = arr[j + 1];
                        //тут первый ставится на второе место
                        arr[j + 1] = t;
                    }
                }
            }
        }
        else  {
            for (int i = arr.length-1; i >=0; i--){
                for (int j = 0; j<i; j++){
                    if (arr[j]< arr[j+1]){
                        int t = arr[j];
                        //тут на место 2го ставится 2й
                        arr[j] = arr[j + 1];
                        //тут второй ставится на второе место
                        arr[j + 1] = t;
                    }
                }
            }
        }
        for (int v : arr) {
            System.out.println(v);
        }
    }

}
