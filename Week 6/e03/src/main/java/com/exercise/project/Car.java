abstract class Car {
    abstract String startEngine();
    abstract String accelerate();
} 

class SportsCar extends Car {
    @Override
    public String startEngine() {
        return "Sports car starts engine with a roar!";
    }

    @Override
    public String accelerate() {
        return "Sports car accelerates quickly!";
    }
}

class FamilyCar extends Car {
    @Override
    public String startEngine() {
        return "Family car starts engine smoothly.";
    }

    @Override
    public String accelerate() {
        return "Family car accelerates steadily.";
    }
}