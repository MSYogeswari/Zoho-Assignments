public class Sequence {
    public static void main(String[] args) {
        String str = "xyyyzzzabb";

        int count = 1;
        for(int i =0;i<str.length();i++)
        {

            if(i<str.length()-1 && str.charAt(i) != str.charAt(i+1))
            {
                System.out.print(str.charAt(i));
                System.out.print(count != 1 ? count : "");
                count = 1;
            }
            else
                count++;
        }
        System.out.print(str.charAt(str.length()-1));
        System.out.print(count != 1 ? count-1 : "");
    }
}
