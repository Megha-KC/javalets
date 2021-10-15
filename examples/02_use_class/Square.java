package shape;

public class Square extends Rectangle{
    int sideLength;
    Square(int sideLength){
        super(sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public void print(){
        System.out.println("This is a square of length: " + Integer.toString(this.sideLength));
    }
}