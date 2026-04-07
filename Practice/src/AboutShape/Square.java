package AboutShape;

public class Square extends Shape{

    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSquare(){
        return side;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
