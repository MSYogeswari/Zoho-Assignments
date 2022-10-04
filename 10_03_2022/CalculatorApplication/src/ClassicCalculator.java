import java.util.Scanner;

class ClassicCalculator {
    void calculate_start() {
        int user_classic_input;
        double operand1,operand2;
        Scanner scobj = new Scanner(System.in);
        do {
            display_Menu();
            user_classic_input = scobj.nextInt();
            switch (user_classic_input) {
                case 1:
                    System.out.println("Enter operand 1: ");
                    operand1 = scobj.nextDouble();
                    System.out.println("Enter operand 2: ");
                    operand2 = scobj.nextDouble();
                    System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                    break;
                case 2:
                    System.out.println("Enter operand 1: ");
                    operand1 = scobj.nextDouble();
                    System.out.println("Enter operand 2: ");
                    operand2 = scobj.nextDouble();
                    System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                    break;
                case 3:
                    System.out.println("Enter operand 1: ");
                    operand1 = scobj.nextDouble();
                    System.out.println("Enter operand 2: ");
                    operand2 = scobj.nextDouble();
                    System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                    break;
                case 4:
                    System.out.println("Enter operand 1: ");
                    operand1 = scobj.nextDouble();
                    System.out.println("Enter operand 2: ");
                    operand2 = scobj.nextDouble();
                    System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                    break;
                case 5: break;
                default:
                    System.out.println("Enter a valid value!");
            }
        }while(user_classic_input != 5);
    }
    void display_Menu()
    {
        System.out.println("Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
}