class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        System.out.println("Starting engine of sports car:\n" + sportsCar.startEngine());
        System.out.println("Accelerating sports car:\n" + sportsCar.accelerate());

        System.out.println(); // separating outputs

        FamilyCar familyCar = new FamilyCar();
        System.out.println("Starting engine of family car:\n" + familyCar.startEngine());
        System.out.println("Accelerating family car:\n" + familyCar.accelerate());
    }
}