public class Calc {
    static void calculator(double number1, double number2, char operation) {
        switch (operation) {
            case '+':
                System.out.print(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
        }
    }
    public static void main (String[] args) {
        calculator(  6,  3,  '-');

   }


}


