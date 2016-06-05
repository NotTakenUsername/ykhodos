package com.playtika.at;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ykhodos on 6/3/2016.
 */
public class HW1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Program is counting number1 to the power of number2");

        System.out.println("Please, enter base number:");
        int num = in.nextInt();

        System.out.println("Please, enter power number:");
        int toPow = in.nextInt();

        numToPow(num, toPow);

    }

    public static void numToPow(int num, int toPow) {
        double result = 1;

        if (toPow > 0) {
            for (int i = 0; i < toPow; i++) {
                result = result * num;
            }
        } else if (toPow < 0) {
            for (int i = 0; i > toPow; i--) {

                result = (result * num);
            }
            result = 1.0 / result;
        }

        System.out.println(result);
    }
}
