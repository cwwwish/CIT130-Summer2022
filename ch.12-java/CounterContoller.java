/*
Christopher Wischmann
CIT 130
Jul 2, 2022 9:00 PM
Purpose:
-startValue - endValue
Plus CounterController
Plus Start()

*/

public class CounterContoller {
    private int startValue;
    private int endValue;
   
    public CounterContoller(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public void start() {
        System.out.println("Starting...\n");
        CounterModel counterModel = new CounterModel(startValue);
        for(int i=startValue;i<endValue;i++) {
            counterModel.increment();      
        }
    }
}
