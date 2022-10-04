import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main mainobj = new Main();
        mainobj.initiate();
    }
    void initiate()
    {
        Scanner sc = new Scanner(System.in);
        int user_input;
        double operand1 ,operand2;
        do {
            display_MainMenu();
            user_input = sc.nextInt();
            switch(user_input)
            {
                case 1: ClassicCalculator classic = new ClassicCalculator();
                        classic.calculate_start();
                        break;
                case 2: ModernCaluclator modern = new ModernCaluclator();
                        modern.modern_calculate_start();
                        break;
                case 3: ScientificCalculator scientific = new ScientificCalculator();
                    scientific.scientific_calculator_start();
                        break;
                case 4:
                        break;
                default: System.out.println("Enter a valid value: ");
            }
        }while(user_input != 3);
    }
void display_MainMenu()
{
    System.out.println("1. Classic Calculator");
    System.out.println("2. Modern Calculator");
    System.out.println("3. Scientific Calculator");
    System.out.println("4. Exit");
}
}