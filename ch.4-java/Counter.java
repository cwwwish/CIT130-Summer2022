public class Counter {
        private int count;
    public Counter(int initialCount) {
        if (initialCount < 0) {
            count = 0;
        } 
        else {
            count = initialCount;
        }
    }

    public void setCounter(int newCount){
        count = newCount;
    }

    public int getCounter() {
    return count;
    }

    public void increment1(){
        count++;
    }

    public void decrement1() {
        if (count==0) {
            System.out.println("Error- Attempted to subtract 1 Counter from 0 Counter. Number of Counter reset to 0." );
            return;
        }
        count--;
    }

    public String toString(){
        return "" + count;
    }

    public boolean equals(Counter c){
        boolean result = false;
        if (this.getCounter() == c.getCounter()){
            result = true;
            return result;
        }
        return result;
    }
    
    public static boolean getBoolean(String counterOK){
        boolean result = true;
        if (check > 0){
            return result;
        }
            else
                return false;

    }
}
    