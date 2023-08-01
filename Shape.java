public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "No color";
        filled = false;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(){
        this.filled=filled;
    }
    @Override
    public String toString() {
        return "\nColor= " + color + "\nFilled= " + filled;
    }
}
