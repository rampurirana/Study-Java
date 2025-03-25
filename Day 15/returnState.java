// Return statement : Return statement is used to exit from a method and optionally return a value to the caller

public class ReturnState {

    // 1. Returning a value from a method
    public int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }

    // 2. Exiting from a void method
    public void showMessage(boolean condition) {
        if (!condition) {
            return; // Exits the method early
        }
        System.out.println("Condition is true!");
    }

    // 3. Returning an object (String in this case)
    public String getMessage() {
        return "Hello, Rampravesh Rana";
    }

    public static void main(String[] args) {
        ReturnState obj = new ReturnState();

        // Calling add() and printing the returned value
        int sum = obj.add(5, 10);
        System.out.println("Sum: " + sum);

        // Calling showMessage() with false (it will exit early)
        obj.showMessage(false);
        // Calling showMessage() with true (it will print)
        obj.showMessage(true);

        // Calling getMessage() and printing the returned string
        String message = obj.getMessage();
        System.out.println("Message: " + message);
    }
}