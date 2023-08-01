public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 15);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("_______________________________________________________");

        System.out.println("Rectangle: ");
        Rectangle rectangle = new Rectangle("Blue", false, 30, 30);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("_______________________________________________________");

        Square square = new Square("Green",true,20);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}