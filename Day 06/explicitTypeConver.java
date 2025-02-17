// 2. Explict type casting : Explicit type casting is manually convert a larger data type into a smaller data type
//This is also called narrowing conversion and it may lead to data loss

public class explicitTypeConver {
    public static void main(String[] args) {
        double doubNum = 10.52d; // double value(larger)
        int intNum = (int) doubNum; // change into integer(smaller)
        System.out.println(intNum);
    }
}
