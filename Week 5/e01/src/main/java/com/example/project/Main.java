public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSideLength(10);
        System.out.println(square.getSideLength());
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}