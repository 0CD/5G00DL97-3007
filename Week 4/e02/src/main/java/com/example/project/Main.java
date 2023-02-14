public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("911 GT3 RS");
        car.setYear(2023);

        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());
        System.out.println("Is car running?: " + car.isRunning());
        System.out.println("Car speed: " + car.getSpeed());

        car.startEngine();
        car.accelerate();
        car.accelerate();
        car.brake();
        System.out.println("Is car running?: " + car.isRunning());
        System.out.println("Car speed: " + car.getSpeed());
        
    }
}