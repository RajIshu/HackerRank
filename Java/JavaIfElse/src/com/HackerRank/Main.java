/*
In this challenge, we test your knowledge of using if-else conditional
statements to automate decision-making processes. An if-else statement
has the following logical flow:

Image Link: https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/If-Then-Else-diagram.svg/498px-If-Then-Else-diagram.svg.png


Task:

Given an integer, n, perform the following conditional actions:
   1. If n is odd, print Weird
   2. If n is even and in the inclusive range of  to , print Not Weird
   3. If n is even and in the inclusive range of  to , print Weird
   4. If n is even and greater than , print Not Weird

Complete the stub code provided in your editor to print whether or not n
is weird.


Input Format:

A single line containing a positive integer, .


Constraints:

1 <= n <= 100


Output Format:

Print Weird if the number is weird; otherwise, print Not Weird.


Sample Input 0:
3

Sample Output 0:
Weird

Sample Input 1:
24

Sample Output 1:
Not Weird


Explanation:

Sample Case 0: n = 3
 n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n = 24
 n > 20 and n is even, so it isn't weird. Thus, we print
 Not Weird.
*/



package com.HackerRank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            if(num >= 2 && num <= 5){
                System.out.println("Not Weird");
            }
            else if(num >= 6 && num <= 20 ){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
    }

}
