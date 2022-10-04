import java.util.Scanner;

class ScientificCalculator {
    void scientific_calculator_start()
    {
        double operand;
        double result = 0;
        int user_option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        do {
            System.out.println("Please select any option");
            System.out.println("1. sin");
            System.out.println("2. cos");
            System.out.println("3. tan");
            System.out.println("4. log");
            System.out.println("5. sqrt");
            System.out.println("6. exit");
            user_option = sc.nextInt();

switch(user_option)
{

    case 1:System.out.println("Enter a number: ");
        operand = sc.nextDouble();
        result = Math.ceil(Math.sin(operand));
        System.out.println("sin(" + operand+") = "+ result);
        break;
    case 2: System.out.println("Enter a number: ");
        operand = sc.nextDouble();
        result = Math.ceil(Math.cos(operand));
        System.out.println("cos(" + operand+") = "+ result);
        break;
    case 3:System.out.println("Enter a number: ");
        operand = sc.nextDouble();
        result = Math.ceil(Math.tan(operand));
        System.out.println("tan(" + operand+") = "+ result);
        break;
    case 4:System.out.println("Enter a number: ");
        operand = sc.nextDouble();
        result = Math.ceil(Math.log(operand));
        System.out.println("log(" + operand+") = "+ result);
        break;
    case 5:System.out.println("Enter a number: ");
        operand = sc.nextDouble();
        result = Math.ceil(Math.sqrt(operand));
        System.out.println("sqrt(" + operand+") = "+ result);
        break;
    case 6:break;
    default: System.out.println("Enter a valid value");
}
        }while(user_option !=6 );


    }
}
