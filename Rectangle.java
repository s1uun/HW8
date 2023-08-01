public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width , double length){

        this.width=width;
        this.length=length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return getWidth() * getLength();
    }
    public double getPerimeter(){
        return 2 * ( getWidth() + getLength() );
    }

    @Override
    public String toString() {
        return "width= " + width + "\nlength= " + length + ", " + super.toString();
    }
/*
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30,30);
        System.out.println(rectangle.toString());
        System.out.println("Area Rectangle= " + rectangle.getArea());
        System.out.println("Area Perimeter= " + rectangle.getPerimeter());
    }*/
}
