class Main {
    public static void main(String[] args) {
        Car car = new Car("Mazda", "RX-7");
        Car.Engine engine = car.new Engine(1.3);

        System.out.println("Car: " + car.getMake() + " " + car.getModel());
        System.out.println("Engine: " + engine.getHorsepower() + " hp");
    }
}