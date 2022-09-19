public class Rectangle extends Figure {
    private int length;
    private int height;
    
    public Rectangle() {
    super(0,0,"none");
    setLength(0);
    setHeight(0);
    }

    public Rectangle(String n,int a, int b, int length, int height) {
    super(a, b, n);
    setLength(length);
    setHeight(height);
    }
    
    public void setLength(int length) {
    this.length = length;
    }
    
    public void setHeight(int height) {
    this.height = height;
    }
    
    public int getLength() {
    return length;
    }
    
    public int getHeight() {
    return height;
    }
    
    @Override
    public void erase() {
    System.out.println("In Rectangle erasing");
    }
    
    @Override
    public void draw() {
    center();
    erase();
    System.out.println(""+this);
    }
    public String toString() {
    return "In Rectangle Drawing "+getName()+" centered at ("+getX()+","+getY()+") height "+ getHeight()+" length "+getLength();

    } 
}
    
    