package Lab05;

public class Triangle extends Shape{
    protected double sideA, sideB, sideC;
    public Triangle(){
        sideA = 1.0;
        sideB = 1.0;
        sideC = 1.0;
    }
    public Triangle(double sideA, double sideB, double sideC){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public Triangle(double sideA, double sideB, double sideC, String color, boolean filled, boolean moved){
        super(color, filled, moved);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return super.toString() + "SideA = " + sideA + "/nSideB = " + sideB + "/nSideC = " + sideC;
    }
}
