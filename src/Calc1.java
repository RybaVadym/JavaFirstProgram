public class Calc1 {
    static void calc1(double param1, double param2, char operation) {
        if(operation == '+'){
            System.out.print(param1 + param2);
        }
        else if(operation == '-'){
            System.out.print(param1 - param2);
        }
        else if(operation == '*'){
            System.out.print(param1 * param2);
        }
        else if(operation == '/'){
            System.out.print(param1 / param2);
        }
    }
    public static void main (String[] args) {
        calc1(7, 9, '+');


    }

}
