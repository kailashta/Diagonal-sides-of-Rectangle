package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Odd Number");
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            for (int j=0;j<number;j++){
                if(i==0 || i == number -1 || j==0 || j == number-1 ) {
                    System.out.print("*");
                }
                else if(i==j || i+j == number -1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
