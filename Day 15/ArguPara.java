// Parameter : A variable used in method that is recieves the value.

// Arguments : The actual value passed to a method when calling it.

public class ArguPara {

    public int add(int firstNum, int secondNum) { // firstNum and secondNum is parameter
        return firstNum + secondNum;
    }

    public static void main(String args[]) {
        ArguPara number = new ArguPara();
        int sum = number.add(10, 15); // 10 and 15 is arguments
        int sum2 = number.add(65, 35);

        System.out.println(sum);
        System.out.println(sum2);
    }

}