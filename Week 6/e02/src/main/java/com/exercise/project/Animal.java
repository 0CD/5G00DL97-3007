abstract class Animal {
    abstract String makeSound();
}

class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}