class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    private class Address {
        private String street;
        private String city;
        private String zip;

        private Address(String street, String city, String zip) {
            this.street = street;
            this.city = city;
            this.zip = zip;
        }
    }

    private class PhoneNumber {
        private String countryCode;
        private String number;

        private PhoneNumber(String countryCode, String number) {
            this.countryCode = countryCode;
            this.number = number;
        }
    }

    private Address address;
    void setAddress(String street, String city, String zip) {
        address = new Address(street, city, zip);
    }

    private PhoneNumber phoneNumber;
    void setPhoneNumber(String countryCode, String number) {
        phoneNumber = new PhoneNumber(countryCode, number);
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + address.street + ", " + address.city + ", " + address.zip);
        System.out.println("Phone: (" + phoneNumber.countryCode + ") " + phoneNumber.number);
    }
}