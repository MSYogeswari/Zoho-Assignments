import java.util.Scanner;
import java.util.Scanner;

class ModernCaluclator {
    void modern_calculate_start() {
        double operand;
        char operator;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        result = sc.nextInt();
        do {

            System.out.println("Select any operator  + , - , * , / , = Enter @ to stop:");
            operator = sc.next().charAt(0);
           switch (operator)
           {
               case '+' : System.out.println("Enter a number: ");
                           operand = sc.nextDouble();
                           result = result + operand;
                          System.out.println("Result: " + result);
                            break;
               case '-': System.out.println("Enter a number: ");
                           operand = sc.nextDouble();
                           result = result - operand;
                           System.out.println("Result: " + result);
                           break;
               case '*': System.out.println("Enter a number: ");
                           operand = sc.nextDouble();
                           result = result * operand;
                           System.out.println("Result: " + result);
                           break;
               case '/': System.out.println("Enter a number: ");
                           operand = sc.nextDouble();
                           result = result / operand;
                           System.out.println("Result: " + result);
                           break;
               case '=': System.out.println("Result: " + result);
                            break;
               case '@': break;
               default: System.out.println("Enter a valid value!");
           }
        }while (operator != '@');
    }
}