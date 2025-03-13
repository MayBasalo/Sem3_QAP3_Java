// Demo class to test the Person class
public class Demo {
    public static void main(String[] args) {
        // Creating a Person object
        Person person1 = new Person("Alice Johnson", 30, "F");
        System.out.println("Person Details:");
        System.out.println(person1);

        // Modifying person details using setter methods
        person1.setName("Bob Smith");
        person1.setAge(40);
        person1.setGender("M");

        // Displaying updated details
        System.out.println("\nUpdated Person Details:");
        System.out.println(person1);
    }
}

