abstract class ElectricDevice {
    public boolean status = false;
    int power = 0;
    public boolean connectionStatus = false;

    abstract void turnOn();
    abstract void turnOff();
    abstract void getPowerConsumption();
}

interface Connectable {
    public void connect();
    public void disconnect();
}

class Smartphone extends ElectricDevice implements Connectable {
    @Override
    public void turnOn() {
        if (this.status == false) {
        System.out.println("Smartphone is turning on.");
        this.status = true;
        this.power = 10;
        }

        else if (this.status == true) {
        System.out.println("Smartphone is already turned on.");
        }
    }

    @Override
    public void turnOff() {
        if (this.status == true) {
        System.out.println("Smartphone is turning off.");
        this.status = false;
        this.power = 0;
        }
        
        else if (this.status == false) {
        System.out.println("Smartphone is already turned off.");
        }
    }

    @Override
    public void getPowerConsumption() {
        System.out.println("Smartphone power consumption: " + this.power + " watts.");
    }

    @Override
    public void connect() {
        if (this.connectionStatus == false && this.status == true) {
            System.out.println("Smartphone is connecting to a network.");
            this.connectionStatus = true;
        }

        else if (this.connectionStatus == true && this.status == true) {
            System.out.println("Smartphone is already connected to a network.");
        }

        else if (this.status == false) {
            System.out.println("Cannot connect to a network. Smartphone is turned off.");
        }
    }

    @Override
    public void disconnect() {
        if (this.connectionStatus == true && this.status == true) {
            System.out.println("Smartphone is disconnecting from a network.");
            this.connectionStatus = false;
        }

        else if (this.connectionStatus == false && this.status == true) {
            System.out.println("Smartphone is already disconnected from a network.");
        }

        else if (this.status == false) {
            System.out.println("Cannot disconnect from a network. Smartphone is turned off.");
        }
    }
}

class Laptop extends ElectricDevice implements Connectable {
    public boolean status = false;
    int power = 0;
    public boolean connectionStatus = false;

    @Override
    public void turnOn() {
        if (this.status == false) {
        System.out.println("Laptop is turning on.");
        this.status = true;
        this.power = 50;
        }

        else if (this.status == true) {
        System.out.println("Laptop is already turned on.");
        }
    }

    @Override
    public void turnOff() {
        if (this.status == true) {
        System.out.println("Laptop is turning off.");
        this.status = false;
        this.power = 0;
        }
        
        else if (this.status == false) {
        System.out.println("Laptop is already turned off.");
        }
    }

    @Override
    public void getPowerConsumption() {
        System.out.println("Laptop power consumption: " + this.power + " watts.");
    }

        @Override
    public void connect() {
        if (this.connectionStatus == false && this.status == true) {
            System.out.println("Laptop is connecting to a network.");
            this.connectionStatus = true;
        }

        else if (this.connectionStatus == true && this.status == true) {
            System.out.println("Laptop is already connected to a network.");
        }

        else if (this.status == false) {
            System.out.println("Cannot connect to a network. Laptop is turned off.");
        }
    }

    @Override
    public void disconnect() {
        if (this.connectionStatus == true && this.status == true) {
            System.out.println("Laptop is disconnecting from a network.");
            this.connectionStatus = false;
        }

        else if (this.connectionStatus == false && this.status == true) {
            System.out.println("Laptop is already disconnected from a network.");
        }

        else if (this.status == false) {
            System.out.println("Cannot disconnect from a network. Laptop is turned off.");
        }
    }
}