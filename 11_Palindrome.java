import java.util.*;
class 11_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp = n;
        int mod , rev =0;
        while(n>0)
        {
            mod = n%10;
            rev = (rev*10) + mod;
            n=n/10;
        }
        if(rev == temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not an palindrome");
        }
        
        
    }
}
