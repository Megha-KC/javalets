package shape;

public class Rectangle{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    int Area(){
        int area = length*width;
        System.out.println("This area is: " +  Integer.toString(area));
        return area;
    }

    public void print(){
        System.out.println("This is a rectangle of length: " +  Integer.toString(length) + " and width: " +  Integer.toString(width));
    }
}