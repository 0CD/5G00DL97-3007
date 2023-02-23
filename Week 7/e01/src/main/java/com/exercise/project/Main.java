class Main {
    public static void main(String[] args) {
        Person person = new Person("Albert Kim");
        person.setAddress("250 St George St", "Toronto", "ON M5R 3L8");
        person.setPhoneNumber("+1", "437-555-1234");

        person.display();
    }
}