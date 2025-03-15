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

         // Displaying updated details
        System.out.println("\nUpdated Person Details:");
        System.out.println(person1);
        // Creating a Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

         // Creating a Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // Creating a CollegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);

    }
}

