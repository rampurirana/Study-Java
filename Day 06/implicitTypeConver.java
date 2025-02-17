// Type conversion : Type conversion are used to change a variable form one data type to another data type

// 1. Implicit type conversion : Implicit type conversion is automatically perfomed by the java compiler when converting smaller data type into larger data type.
// This is also known as narrowing conversion because no data is lost

public class implicitTypeConver {
    public static void main(String[] args) {
        int num = 10; // integer vlaue
        double doubNum = num; // change integer vlaue into double(larger)

        System.out.println(doubNum);
    }
}