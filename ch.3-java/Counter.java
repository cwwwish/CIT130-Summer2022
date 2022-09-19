public class Counter {
    private int count; 
    public Counter(){
        count = 0;
    }

    public void setCounter(int newCount){
        count = newCount;
    }

    public int getCounter(){
        return count;
    }

    public void increment1 (){
        count++;
    }

    public void decrement1 () {
        if (count==0) {
            return;        }
        count--;
    }

    public String toString(){
        return "" + count;
    }

    public boolean equals(Counter c)
    {
        boolean result = false;
        if (this.getCounter() == c.getCounter())
        {
            result = true;
            return result;
        }
        return result;
    }

    public boolean counterOK(int check)
    {
        boolean result = true;
        if (check > 0)
        {
            return result;
        }
            else
                return false;
    }            
}
