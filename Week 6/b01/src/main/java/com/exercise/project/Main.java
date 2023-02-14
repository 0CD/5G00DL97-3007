class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.turnOn();
        smartphone.getPowerConsumption();
        smartphone.connect();
        smartphone.turnOn();
        smartphone.connect();
        smartphone.disconnect();
        smartphone.turnOff();
        smartphone.connect();
        smartphone.getPowerConsumption();


        Laptop laptop = new Laptop();
        laptop.turnOn();
        laptop.getPowerConsumption();
        laptop.connect();
        laptop.turnOn();
        laptop.connect();
        laptop.disconnect();
        laptop.turnOff();
        laptop.connect();
        laptop.getPowerConsumption();
    }
}