import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        AgeFilter filter = new AgeFilter() {
            public boolean accept(Person p) {
                if (p.getAge() >= 40) {
                    return true;
                }
                else {
                    return false;
                }
            }
        };

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(17));
        people.add(new Person(21));
        people.add(new Person(30));
        people.add(new Person(40));
        people.add(new Person(50));

        System.out.println("Filtered People:");
        for (Person p : people) {
            if (filter.accept(p) == true) {
                System.out.println(p.getAge());
            }
        }
    }
}