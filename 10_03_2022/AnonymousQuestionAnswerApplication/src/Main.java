import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main mainobject = new Main();
        mainobject.initiate();
    }
    void initiate()
    {
        QuestionAnswerController connobject = new QuestionAnswerController();
        int userMainMenuInput;
        Scanner sc = new Scanner(System.in);
        do {
            connobject.displayMainMenu();
            userMainMenuInput = sc.nextInt();
            switch (userMainMenuInput)
            {
                case 1: System.out.println("Enter a question here: ");
                        sc.nextLine();
                        String question  = sc.nextLine();
                        connobject.addQuestion(question);
                        break;
                case 2: System.out.println("Select the question number that you want to answer from below list");
                        connobject.displayQuestionAnswers();
                        System.out.println("Enter question number: ");
                        int quesToAnswer = sc.nextInt();
                        sc.nextLine(); //To avoid scanner skipping nextLine problem
                        System.out.println("Enter your answer for question number "+quesToAnswer + ":");
                        String answer = sc.nextLine();
                        connobject.postAnswer(quesToAnswer,answer);
                        break;
                case 3: connobject.displayQuestionAnswers();
                        break;
                case 4: break;
                default: System.out.println("Please enter a valid value");
            }
        }while(userMainMenuInput !=4);
    }
}