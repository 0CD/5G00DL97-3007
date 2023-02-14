class Vehicle {
    private String make;
    private String model;
    private int year;
    private int speed;

    Vehicle(String make, String model, int year, int speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public void accelerate() {
        speed += 10;
    }

    public void decelerate() {
        speed -= 10;
    }

    public int getSpeed() {
        return speed;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int numDoors;

    Car(String make, String model, int year, int speed, int numDoors) {
        super(make, model, year, speed);
        this.numDoors = numDoors;
    }

    public int getNumberOfDoors() {
        return numDoors;
    }
}

class Truck extends Vehicle {
    private int numAxles;

    Truck(String make, String model, int year, int speed, int numAxles) {
        super(make, model, year, speed);
        this.numAxles = numAxles;
    }

    public int getNumAxles() {
        return numAxles;
    }
}