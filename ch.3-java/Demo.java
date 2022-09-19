public class Demo {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println("Initial state");
        System.out.println("Counter1 is at " + c1.toString());
        System.out.println("Counter2 is at " + c2.toString());
        if (c1.equals(c2))
            System.out.println("Counter1 equals Counter2.");
        else
            System.out.println("Counter1 does not equal Counter2");

        c1.increment1();

        System.out.println("Error- Attempted to subtract 1 Counter from 0 Counter. Number of Counter reset to 0." );


        System.out.println("State after first test");
        System.out.println("Counter1 is at " + c1.toString());
        System.out.println("Counter2 is at " + c2.toString());
        if (c1.equals(c2))
            System.out.println("Counter1 equals Counter2.");
        else
            System.out.println("Counter1 does not equal Counter2");

        c2.decrement1();


        System.out.println("State after second test");
        System.out.println("Counter1 is at " + c1.toString());
        System.out.println("Counter2 is at " + c2.toString());
        if (c1.equals(c2))
            System.out.println("Counter1 equals Counter2.");
        else
            System.out.println("Counter1 does not equal Counter2");

        c1.increment1();
        
    }
}
