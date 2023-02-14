class Hardware {
    private String manufacturer;
    private String model;

    Hardware() {
        this.manufacturer = "";
        this.model = "";
    }

    Hardware(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String toString() {
        return this.manufacturer + " " + this.model;
    }
}

class CPU extends Hardware {
    private double speed;

    CPU() {
        super("", "");
        this.speed = 0;
    }

    CPU(String manufacturer, String model, double speed) {
        super(manufacturer, model);
        this.speed = speed;
    }

    public String toString() {
        return super.toString() + " " + Double.toString(this.speed) + " GHz";
    }
}

class GPU extends Hardware {
    private double memory;

    GPU() {
        super("", "");
        this.memory = 0;
    }

    GPU(String manufacturer, String model, double memory) {
        super(manufacturer, model);
        this.memory = memory;
    }

    public String toString() {
        return super.toString() + " " + Double.toString(this.memory) + " GB";
    }
}

class RAM extends Hardware {
    private double capacity;

    RAM() {
        super("", "");
        this.capacity = 0;
    }

    RAM(String manufacturer, String model, double capacity) {
        super(manufacturer, model);
        this.capacity = capacity;
    }

    public String toString() {
        return super.toString() + " " + Double.toString(this.capacity) + " GB";
    }
}

class Storage extends Hardware {
    private double capacity;

    Storage() {
        super("", "");
        this.capacity = 0;
    }

    Storage(String manufacturer, String model, double capacity) {
        super(manufacturer, model);
        this.capacity = capacity;
    }

    public String toString() {
        return super.toString() + " " + Double.toString(this.capacity) + " GB";
    }
}