package com.playtika.at;

import java.util.Arrays;

/**
 * Created by ykhodos on 6/13/2016.
 */
public class HW3 {
    public static void main(String[] args) {
        int x=10,y=10;
        int[]arr = new int[x];
        arr[0]=1;
        for (int i = 1;i<arr.length;i++){
            System.out.print(i+": ");
            for(int j=1;j<y;j++){
                arr[i]=i*j;
                System.out.format("%3d", arr[i]);
            }
            System.out.println();
            }

    }
    }

