/*
Christopher Wischmann
CIT 130
July 16th, 2022
Uses random numbers to simulate actual probable outcomes
*/

import java.util.HashSet;
import java.util.Random;

public class MonteCarloBirthdayParadox {

    public static void main(String[] args){
        Random r = new Random();
        int day;
        int count = 0;
        for(int i = 10; i <= 100; i += 10){
            count = 0;
            for(int j = 0; j < 100000; ++j){
                HashSet<Integer> set = new HashSet<>();
                for(int k = 0; k < i; ++k) {
                    day = 1 + r.nextInt(365);
                    if (set.contains(day)) {
                        ++count;
                        break;
                    } else {
                        set.add(day);
                    }
                }
            }
            System.out.printf("After 100000 tests there were %d occurrences of shared birthdays in a set of %d people\n", count, i);
            System.out.println("Probability: " + count / 100000.0);
            System.out.println("Process completed");
        }
    }
}
