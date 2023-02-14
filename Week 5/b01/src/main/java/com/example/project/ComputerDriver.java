import java.util.Scanner;

public class ComputerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user for the cpu details
        System.out.print("\nEnter your CPU manufacturer: ");
        String cpuManufacturer = scanner.nextLine();
        System.out.print("Enter your CPU model: ");
        String cpuModel = scanner.nextLine();
        System.out.print("Enter your CPU speed: ");
        double cpuSpeed = scanner.nextDouble();
        scanner.nextLine();

        CPU cpu = new CPU(cpuManufacturer, cpuModel, cpuSpeed);

        // ask user for the gpu details
        System.out.print("\nEnter your GPU manufacturer: ");
        String gpuManufacturer = scanner.nextLine();
        System.out.print("Enter your GPU model: ");
        String gpuModel = scanner.nextLine();
        System.out.print("Enter your GPU memory: ");
        double gpuMemory = scanner.nextDouble();
        scanner.nextLine();

        GPU gpu = new GPU(gpuManufacturer, gpuModel, gpuMemory);

        // ask user for the ram details
        System.out.print("\nEnter your RAM manufacturer: ");
        String ramManufacturer = scanner.nextLine();
        System.out.print("Enter your RAM model: ");
        String ramModel = scanner.nextLine();
        System.out.print("Enter your RAM capacity: ");
        double ramCapacity = scanner.nextDouble();
        scanner.nextLine();

        RAM ram = new RAM(ramManufacturer, ramModel, ramCapacity);

        // ask user for the storage details
        System.out.print("\nEnter your storage manufacturer: ");
        String storageManufacturer = scanner.nextLine();
        System.out.print("Enter your storage model: ");
        String storageModel = scanner.nextLine();
        System.out.print("Enter your storage capacity: ");
        double storageCapacity = scanner.nextDouble();
        scanner.nextLine();

        Storage storage = new Storage(storageManufacturer, storageModel, storageCapacity);
        
        Computer computer = new Computer(cpu, gpu, ram, storage);
        System.out.println("\n" + computer);
    }
}