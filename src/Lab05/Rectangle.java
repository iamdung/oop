package Lab05;

public class Rectangle extends Shape{
    protected double width ;
    protected double length;
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled, boolean moved){
        super(color, filled, moved);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double setPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return super.toString() + "Width = " + width + "/nLength = " + length;
    }
}
