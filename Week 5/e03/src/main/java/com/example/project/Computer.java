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

    public double getTotalMemory() {
        return this.gpu.getMemory() + this.ram.getCapacity();
    }

    public double getTotalCapacity() {
        return this.storage.getCapacity() + this.ram.getCapacity();
    }
}