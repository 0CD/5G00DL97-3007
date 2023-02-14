public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porsche", "911 GT3 RS", 2023, 110, 2);

        for (int i = 0; i < 5; i++) {
            car.accelerate();
            System.out.println(car.getSpeed());
        }

        for (int i = 0; i < 2; i++) {
            car.decelerate();
            System.out.println(car.getSpeed());
        }
        
        Truck truck = new Truck("Ford", "F-150 Raptor", 2023, 70, 4);

        for (int i = 0; i < 5; i++) {
            truck.accelerate();
            System.out.println(truck.getSpeed());
        }

        for (int i = 0; i < 3; i++) {
            truck.decelerate();
            System.out.println(truck.getSpeed());
        }
    }
}