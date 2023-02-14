public class Main {
    public static void main(String[] args) {
    Animal animal1 = new Animal("Jake", "Dog", 3);
    Animal animal2 = new Animal("Leo", "Lion", 5);
    Animal animal3 = new Animal("Bella", "Cat", 9);
    Animal animal4 = new Animal("Jake", "Dog", 3);

    animal1.display(); // displays information about animal1
    animal2.display(); // displays information about animal2
    animal3.display(); // displays information about animal3

    System.out.println(animal1.equals(animal2)); // should output false
    System.out.println(animal1.equals(animal4)); // should output true
    System.out.println(animal3.equals(animal3)); // should output true
    }
}