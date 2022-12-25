package Lab05;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled, boolean moved){
        super(side, side, color, filled, moved);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length=side;
    }
    @Override
    public String toString() {
        return "Color =" + color + "/nFilled = " + filled + "/nMoved = " + moved + "/nSide = " + width;
    }
}
