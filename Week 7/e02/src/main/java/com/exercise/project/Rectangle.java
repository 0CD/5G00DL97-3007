class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return this.width * this.height;
    }


    class RectangleDimensions {
        private int width;
        private int height;

        RectangleDimensions(int width, int height) {
            this.width = width;
            this.height = height;
        }
        int getPerimeter() {
            return 2 * (width + height);
        }
    }
}