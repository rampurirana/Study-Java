// Instances Variable : Declared inside a class but outside any method, constructor, and block. Each objects has own copy
class student {
    // each objects gets its own copy
    String name;
    int age;

    // constructor to initiliaze instances variables
    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method to dislplay student details
    void dislplay() {
        System.out.println("Name : " + name + ", Age : " + age);
    }
}

public class InstancesVariable {
    public static void main(String[] args) {

        // create objects of student class
        student name1 = new student("Rampravesh Rana", 20);

        // display details of each student
        name1.dislplay();
    }
}