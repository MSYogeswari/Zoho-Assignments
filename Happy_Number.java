import java.util.*;
class Happy_Number {
    public static void main(String[] args) {
   int x,temp;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   x = sc.nextInt();
   int sum = 0,mod , sumnew =0;
   temp = x;
   while(x>0)
   {
       mod = x%10;
       sum = sum + (mod*mod);
       x = x/10;
   }
   if(sum != 0)
   {
       while(sum >0)
       {
           mod = sum%10;
           sumnew = sumnew + mod;
           sum = sum/10;
       }
   }
if(sumnew == 1 )
    System.out.println("Happy number");
else
    System.out.println("Not a happy number");
    }
}
