/*
Christopher Wischmann
CIT 130
Jul 2, 2022 9:00
Purpose:
Test
*/

import java.util.Scanner;

public class CounterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("This program tests a timer.");
 
        do {
           System.out.println("Enter a start number of seconds.");
            int startValue = sc.nextInt();
        
            System.out.println("Enter an end number of seconds.");
            int endValue = sc.nextInt();
           
            CounterContoller counterContoller = new CounterContoller(startValue, endValue);
            counterContoller.start();
           
            System.out.println("Continue?(y/n)");
            ch = sc.next().charAt(0);
           
        } 
        while(ch=='y' || ch=='Y');  
        System.out.println("Process completed.");
        sc.close();
    }
}