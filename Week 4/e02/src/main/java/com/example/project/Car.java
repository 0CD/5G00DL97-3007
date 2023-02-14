class Car {
    private String make;
    private String model;
    private int year;
    private int speed;
    private boolean isRunning;

    Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setMake(String carMake) {
        if (carMake != null && !carMake.isEmpty()) {
        make = carMake;
        }
        else {
            throw new IllegalArgumentException("Invalid value.");
        }
    }

    public void setModel(String carModel) {
        if (carModel != null && !carModel.isEmpty()) {
        model = carModel;
        }
        else {
            throw new IllegalArgumentException("Invalid value.");
        }
    }
    
    public void setYear(int carYear) {
        if (carYear > 0) {
        year = carYear;
        }
        else {
            throw new IllegalArgumentException("Invalid value.");
        }
    }

    public void setSpeed(int carSpeed) {
        speed = carSpeed;
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

    public int getSpeed() {
        return speed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void startEngine() {
        if (isRunning != true) {
        isRunning = true;
        }
        else {
            System.out.println("The car is already running.");
        }
    }

    public void stopEngine() {
        if (isRunning != false) {
            isRunning = false;
        }
        else {
            System.out.println("The car is already shut off.");
        }
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        if (speed >= 0) {
            speed -= 10;
        }
        else {
            System.out.println("The car is already stopped.");
        }
    }
}
