public class Circle extends Shape{
    private double radius=1.0;

    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;

    }
    public double getArea(){
        return Math.PI * getRadius() * getRadius();
    }
    public double getPerimeter(){
        return 2* Math.PI * getRadius();
    }

    @Override
    public String toString(){

        return "Circle: " +super.toString() + "\nRadius= " + getRadius();
    }
    /*
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.println(circle.toString());
        System.out.println("Area Circle= " + circle.getArea());
        System.out.println("Area Perimeter= " + circle.getPerimeter());
    }*/
}
