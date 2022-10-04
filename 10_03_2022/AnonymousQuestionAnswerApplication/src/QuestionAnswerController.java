import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class QuestionAnswerController {
    static int questionnumber = 1;
   LinkedHashMap< LinkedHashMap<Integer,String>, ArrayList<String>> questionanswer = new LinkedHashMap<>();

    QuestionAnswerController()
    {
        LinkedHashMap<Integer,String> tempmap = new LinkedHashMap<>();
        tempmap.put(questionnumber++,"What is Java OOPS Concepts ?");
        ArrayList<String> temp = new ArrayList<>();
        temp.add("Abstraction");
        temp.add("Encapsulation");
        temp.add("Inheritance");
        temp.add("Polymorphism");
        questionanswer.put(tempmap ,temp);
        LinkedHashMap<Integer,String> tempmap2 = new LinkedHashMap<>();
        tempmap2.put(questionnumber++,"What is an object? ?");
        ArrayList<String> temp2 = new ArrayList<>();
        temp2.add("Real world entity");
        temp2.add("Copy of class");
        questionanswer.put(tempmap2 ,temp2);
    }
    void displayMainMenu()
    {
        System.out.println("**************************MENU********************************");
        System.out.println("1. Ask a question");
        System.out.println("2. Post an answer");
        System.out.println("3. View all questions and answers");
        System.out.println("4. Exit");
        System.out.println("**************************************************************");
    }
void addQuestion(String question)
{
    LinkedHashMap<Integer,String> tempques = new LinkedHashMap<>();
    tempques.put(questionnumber++,question);
    questionanswer.put(tempques,new ArrayList<>());
    System.out.println("Question asked successfully!");
}
void postAnswer(int questionNumber,String answer)
{

    for(Map.Entry<LinkedHashMap<Integer,String>,ArrayList<String>> map : questionanswer.entrySet()) {
        for (Map.Entry<Integer, String> maps : map.getKey().entrySet()) {
            if (maps.getKey() == questionNumber) {
                ArrayList<String> tempanswer = map.getValue();
                tempanswer.add(answer);
                map.setValue(tempanswer);
                System.out.println("Answer posted successfully!");
            }
        }
    }
}
void displayQuestionAnswers()
{
    for(Map.Entry<LinkedHashMap<Integer,String>,ArrayList<String>> map : questionanswer.entrySet())
    {
        for(Map.Entry<Integer,String> maps : map.getKey().entrySet())
        {
            System.out.printf("%-5s%-20s\n",maps.getKey(),maps.getValue());
            //for(int i=0;i<map.getValue().size();i++)
            //{
              //  System.out.printf("%-5s%-5s%-20s\n","  "," * ",map.getValue().get(i));
            //}
            for(String ansvalue : map.getValue())
            {
                System.out.printf("%-5s%-5s%-20s\n","  "," * ",ansvalue);
            }
            }
        }
    }
}