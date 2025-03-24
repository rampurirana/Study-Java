// Function : a function is a block of code that performs a spicific task and can be called when needed

public class function {
    public int add(int firstNum, int secondNum) { // public = modifier, int = return type, add = function name
        return firstNum + secondNum;
    }

    public static void main(String args[]) {
        function number = new function(); // created object using new keyword
        int result = number.add(10, 25); // calling the function

        System.out.println(result);
    }
}
