import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Counter c1 = new Counter(), c2 = new Counter();

        //show initial state of counters
        System.out.println("Initial state");
        System.out.println("Counter1 is at " + c1.toString());
        System.out.println("Counter2 is at " + c2.toString());
        if (c1.equals(c2))
            System.out.println("Counter1 equals Counter2.");
        else
            System.out.println("Counter1 does not equal Counter2");

        c1.decrement1();

        if (c1.counterOK(c1)){
            System.out.println();
        }
        else
            System.out.println("Error - attempted to subtract 1 Counter from 0 Counter.\n" + "Number of Counter reset to 0.");
        System.out.println(c1.toString());
        
    }
} 

