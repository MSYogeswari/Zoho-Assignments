import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string:");
        String str = sc.next();
        String temp = "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)-48 >=0 && str.charAt(i)-48 <= 9)
            {
                int loop = str.charAt(i)-48;
                String tempstr = temp;
                while(loop > 0) {
                    temp = temp + tempstr;
                    loop--;
                }
            }
            else {
                temp = temp + str.charAt(i);
            }
        }
        System.out.print(temp);
    }
}
