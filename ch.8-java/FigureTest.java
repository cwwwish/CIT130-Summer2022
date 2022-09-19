public class FigureTest {
    public static void main(String[] args) {

    Figure[] figures = new Figure[100];
    
    figures[0] = new Rectangle("Rectangle",25,100,10,15);
    figures[1] = new Hexagon("Hexagon",22,45,10,50);
    figures[2] = new Circle("Circle",5,10,3);
    figures[3] = new Hexagon("Hexagon",33,14,100,50);
    
    for(int i = 0; i < Figure.getNumberOfShapes(); i++) {
    figures[i].draw();

    }
  }
}