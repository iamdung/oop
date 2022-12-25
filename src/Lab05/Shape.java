package Lab05;

public class Shape {
    protected String color;
    protected boolean filled;
    protected boolean moved;
    public Shape(){
        color = "red";
        filled = true;
        moved = true;
    }
    public Shape(String color, boolean filled, boolean moved){
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    @Override
    public String toString() {
        return "Color = " + color + "/nFilled = " + filled + "/nMoved = " + moved;
    }
}
