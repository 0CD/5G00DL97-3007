class Computer {
    CPU cpu = new CPU();
    GPU gpu = new GPU();
    RAM ram = new RAM();
    Storage storage = new Storage();

    Computer(CPU cpu, GPU gpu, RAM ram, Storage storage) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }

    public String toString() {
        return "CPU: " + this.cpu + "\nGPU: " + this.gpu + "\nRAM: " + this.ram + "\nStorage: " + this.storage;
    }
}