/*
Christopher Wischmann
CIT 130
July 9th, 2022
Generic class with type parameter, takes ArrayList and returns stdev
*/

import java.util.ArrayList;

public class MyMathClass {

   public static <T extends Number> double stdev(ArrayList<T> a) {

       double total = 0;
       double average = 0;
      
       for (T t : a) {
           total = total + t.doubleValue();
       }

       average = total / 10;
       System.out.println("average " + average);

       total = 0;
       for (T t : a) {
           total += (t.doubleValue() - average) * (t.doubleValue() - average);
       }
       total /= 9;
       double std = Math.sqrt(total);

       return std;
   }

}


