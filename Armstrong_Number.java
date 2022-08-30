import java.util.*;
class Armstrong_Number {
    public static void main(String[] args) {
   int x,temp;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   x = sc.nextInt();
   int sum = 0,mod;
   temp = x;
   while(x>0)
   {
       mod = x%10;
       sum = sum + (mod*mod*mod);
       x = x/10;
   }
if(temp == sum )
    System.out.println("Armstrong number");
else
    System.out.println("Not an armstrong number");
    }
}
