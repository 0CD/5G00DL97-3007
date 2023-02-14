class Shape {
    private int numberOfSides;

    Shape() {
        this.numberOfSides = 0;
    }

    Shape(int number) {
        this.numberOfSides = number;
    }

    public void setNumberOfSides(int number) {
        numberOfSides = number; 
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }
}

class Square extends Shape {
    private int sideLength;

    Square() {
        this.sideLength = 0;
    }

    Square(int length) {
        this.sideLength = length;
    }

    public void setSideLength(int length) {
        sideLength = length; 
    }

    public int getSideLength() {
        return sideLength;
    }

    public int getArea() {
        return sideLength * sideLength;
    }

    public int getPerimeter() {
        return sideLength * 4;
    }
}

class Circle extends Shape {
    private int radius;

    Circle() {
        this.radius = 0;
    }

    Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int length) {
        radius = length; 
    }

    public int getRadius() {
        return radius;
    }

    public int getArea() {
        double area = radius * radius * 3.14159;
        int areaRounded = (int) area;
        return areaRounded;
    }

    public int getPerimeter() {
        double perimeter = radius * 2 * 3.14159;
        int perimeterRounded = (int) perimeter;
        return perimeterRounded;
    }
}