//Static Variable : Declared inside a class with static keyword

class Student {
    // each object gets its own copy
    String name;
    int rollNumber;

    // shared by all objects of the class
    static String schoolName = "JJHS, Keshwari";

    // Constructor to initialize instance variables
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    void display() {
        System.out.println("Name : " + name + ", Roll Number : " + rollNumber + ", School : " + schoolName);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student s1 = new Student("Rampravesh Rana", 101);
        Student s2 = new Student("Ashish Rana", 102);

        // Displaying student details
        s1.display();
        s2.display();

        // Modifying the static variable (affects all objects)
        Student.schoolName = "Jeevan Jyoti High School, Keshwari";

        // Displaying details again to see the effect of static variable change
        s1.display();
        s2.display();
    }
}