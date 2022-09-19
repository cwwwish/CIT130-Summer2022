/*
Christopher Wischmann
CIT 130
July 9th, 2022
Test Arrays for stdev
*/

import java.util.ArrayList;

public class Demo {
  
    public static void main(String[] args) {
 
        ArrayList<Double> doubleList = new ArrayList<Double>();
        for(int i=1;i<=10;i++) {
            doubleList.add(Double.parseDouble(String.valueOf(i)));
        }
        System.out.println("standard deviation 0-9 type Double "+MyMathClass.stdev(doubleList));
       
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i=1;i<=10;i++) {
            intList.add(i);
        }
        System.out.println("standard deviation 0-9 type Integer "+MyMathClass.stdev(intList));
       
    }
 }
