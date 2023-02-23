class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.getArea());

        Rectangle.RectangleDimensions dimensions = rectangle.new RectangleDimensions(5, 10);
        System.out.println("Perimeter: " + dimensions.getPerimeter());
    }
}