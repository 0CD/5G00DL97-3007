class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 3);
        System.out.println("Triangle area: " + triangle.calculateArea());

        Circle circle = new Circle(9);
        System.out.println("Circle area: " + circle.calculateArea());
    }
}