class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat sound: " + cat.makeSound());

        Dog dog = new Dog();
        System.out.println("Dog sound: " + dog.makeSound());
    }
}