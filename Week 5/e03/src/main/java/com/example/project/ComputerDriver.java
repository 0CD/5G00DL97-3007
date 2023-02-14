public class ComputerDriver {
    public static void main(String[] args) {
        CPU cpu = new CPU("AMD", "Ryzen 9 7900X", 4.7);
        GPU gpu = new GPU("Nvidia", "RTX 4090", 24);
        RAM ram = new RAM("G.Skill", "Trident Z RGB", 64);
        Storage storage = new Storage("Samsung", "980 PRO", 1024);
        Computer computer = new Computer(cpu, gpu, ram, storage);
        System.out.println("Total memory: " + computer.getTotalMemory() + " GB");
        System.out.println("Total capacity: " + computer.getTotalCapacity() + " GB");
    }
}