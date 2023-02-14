class Animal {
    private String name;
    private String type;
    private int age;

    Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + ", Type: " + this.type + ", Age: " + this.age;
    }

    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (!(another instanceof Animal)) {
            return false;
        }
        Animal anim = (Animal) another;
        return name.equals(anim.name) && type.equals(anim.type) && Integer.compare(age, anim.age) == 0;
    }

    public void display() {
        System.out.println(this);
    }
}
