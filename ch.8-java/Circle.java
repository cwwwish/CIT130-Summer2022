public class Circle extends Figure {
    private int radius;
    public Circle() {
    super(0,0,"none");
    setRadius(1);
    }
    
    public Circle( String n,int a, int b, int radius) {
    super(a, b, n);
    setRadius(radius);
    }
    
    public void setRadius(int radius) {
    this.radius = radius;
    }
    
    public int getRadius() {
    return radius;
    }

    public String toString(){
    return "In Circle Drawing "+getName()+" centered at ("+getX()+","+getY()+") radius "+getRadius();
    }

    public void erase() {
    System.out.println("In Circle erasing");
    }

    public void draw() {
    center();
    erase();
    System.out.println(""+this);

    }
}
