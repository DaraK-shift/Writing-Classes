public class Main {
    public static void main(String[] args) {
        // Task 6: Create more objects and test the methods
        Person p1 = new Person("Eda", "eda@gmail.com", "123-456-7890", 11);
        p1.print();
        Person p2 = new Person("Hannah", "hannah@gmail.com", "404-839-9955", 12);
        p2.print();
        Person p3 = new Person("Dara", "Dara@gmail.com", "404-899-5955", 13);
        p3.print();
        Person p4 = new Person("Lora", "lora@gmail.com", "404-899-2955", 110);
        p4.print();
        Person p5 = new Person("Mimi", "maria@gmail.com", "433-899-9955", 19);
        p5.print();

        // Task 8: Test the updateEmail method
        p2.update("penka@gmail.com");
        p2.print();
    }
}

// Define the Person class here
class Person {
    // Instance variables
    private String name;
    private String email;
    private String phoneNumber;
    private int age;

    // Task 1: Add a new attribute (e.g., age)

    // Constructor: Initialize Person data
    public Person(String initName, String initEmail, String initPhone, int initAge) { // Task 2: modify method signature to include your new attribute.
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
        age = initAge;
        // Task 3: Assign a default value to the new attribute here.
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);

        // Task 4: Print the new attribute here
    }

    // Task 5: Add getter methods to access and return each attribute individually. Here's an example:
        public String getName() {
        return name;

    }
        public String getPhoneNumber() {
        return phoneNumber;

    }
        public String getEmail() {
        return email;

    }
        public int getAge() {
        return age;

    }

    // Task 7: Add a method to update the email
    public void update(String updateEmail){
        email = updateEmail;
    }
}