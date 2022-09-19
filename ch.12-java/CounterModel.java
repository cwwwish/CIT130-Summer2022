/*
Christopher Wischmann
CIT 130
Jul 2, 2022 9:00 PM
Purpose: 
-counter
Plus CounterMode(in initialValue int)
Plus Increment():void
*/

public class CounterModel {
    private int counter;
    public CounterModel(int initialValue) {
        this.counter = initialValue;
    }
    public void increment() { 
        try {
           Thread.sleep(1000);
            counter++;
            CounterView.display(counter);
        } 

        catch(Exception e) {
            System.out.println("Exception occurred while incrementing counter : "+e.getMessage());
        }
    }
}