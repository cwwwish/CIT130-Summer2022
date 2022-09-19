/*
Christopher Wischmann
CIT 130
Jul 2, 2022 9:00 PM
Recursion
*/

import java.util.*;

public class TowerOfHanoi {
    public static int i = 1;
    public static void towers(int numDisks, int startPeg, int destPeg, int sparePeg) {
        if (numDisks == 1){
            System.out.println(i++ + ": " + startPeg + " to " + destPeg);
            numDisks = numDisks;
        }
        else {
            towers(numDisks-1, startPeg, sparePeg, destPeg);
            System.out.println(i++ + ": " + startPeg + " to " + destPeg);
            towers(numDisks-1, sparePeg, destPeg, startPeg);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of Disks: ");
        int numOfDisks = new Scanner(System.in).nextInt();
        System.out.println("Starting tower");
        towers(numOfDisks, 1, 3, 2);
        System.out.println("Finished Tower");
    }
}
    
    