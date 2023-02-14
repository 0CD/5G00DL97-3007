public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Robert", "Cribbs", 34);
        Person person2 = new Person("Steven", "Campbell", 27);
        Person person3 = new Person("Mary", "Melton");
        Person person4 = new Person("Heather", "Keller");
        Person person5 = new Person();

        person1.display();
        person2.display();
        person3.display();
        person4.display();
        person5.display();
    }
}