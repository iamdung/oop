package Lab04;

class Circle extends Shape {
    protected double radius ;
    final double pi = 3.14;
    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return pi * radius * radius;
    }
    public double setPerimeter(){
        return pi * 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString()+"Radius = "+radius+"\n";
    }
}