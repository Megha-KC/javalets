package shape;

public class Main{
    public static void main(String args[]){
        Rectangle rectObj = new Rectangle(3, 4);
        rectObj.print();
        rectObj.Area();

        Square sqObj = new Square(5);
        sqObj.print();
        sqObj.Area();
    }
}
