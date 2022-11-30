/*

*/


package com.HackerRank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int a, b, n;

        while(q > 0){
            int sum = 0;
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();

            for (int i = 0; i < n; i++){
                int mul = 1;
                int j = 0;
                do{
                    if(i == 0){
                        mul = 1;
                    }
                    else
                        mul = (mul * 2);
                    j++;
                }while(j<i);
                sum = sum + (mul * b);
                System.out.print((a + sum) + " ");
            }
            System.out.print("\n");
            q--;
        }


    }
}
