package Lab04;

class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String c, boolean f){
        color = c;
        filled = f;
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

    @Override
    public String toString() {
       return "Color = "+ color + "\n" + "Filled = "+filled+"\n";
    }
}

