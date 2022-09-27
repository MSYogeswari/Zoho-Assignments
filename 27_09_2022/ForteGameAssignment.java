import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.initiate();
    }
    void initiate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fourte Game!");
        System.out.println("Operators: ( + - * / ) ");
        System.out.println("Enter four numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("Enter target number: ");
        int target = sc.nextInt();
        check_single_digit_addition(num1, num2, num3, num4, target);
        check_single_digit_subtraction(num1, num2, num3, num4, target, 1, 1);
        check_single_digit_multiplication(num1, num2, num3, num4, target);
        check_single_digit_division(num1, num2, num3, num4, target, 1, 1);
        check_combination_operation_all(num1,num2,num3,num4,target);
        check_double_digit(num1, num2, num3, num4, target);
        check_triple_digit(num1, num2, num3, num4, target);
    }
    void check_double_digit(int num1,int num2,int num3,int num4,int target) {
        int newnum1 = (num1*10)+num2;
        num2 = newnum1;
        check_single_digit_addition(0,num2,num3,num4,target);
        check_single_digit_multiplication(1,num2,num3,num4,target);
        check_single_digit_subtraction(0,num2,num3,num4,target,1,1);
        check_single_digit_division(1,num2,num3,num4,target,1,1);
        newnum1 = (num2*10)+num3;
        num3 = newnum1;
        check_single_digit_addition(num1,0,num3,num4,target);
        check_single_digit_multiplication(num1,1,num3,num4,target);
        check_single_digit_subtraction(num1,0,num3,num4,target,1,1);
        check_single_digit_division(num1,1,num3,num4,target,1,1);
        newnum1 = (num3*10)+num4;
        num4 = newnum1;
        check_single_digit_addition(num1,num2,0,num4,target);
        check_single_digit_multiplication(num1,num2,1,num4,target);
        check_single_digit_subtraction(num1,num2,0,num4,target,1,1);
        check_single_digit_division(num1,num2,1,num4,target,1,1);

    }
    void check_triple_digit(int num1,int num2,int num3,int num4,int target) {
        int newnum1 = (num1*100)+(num2*10)+num3;
        num3 = newnum1;
        check_single_digit_addition(0,0,num3,num4,target);
        check_single_digit_multiplication(1,1,num3,num4,target);
        check_single_digit_subtraction(0,0,num3,num4,target,1,1);
        check_single_digit_division(1,1,num3,num4,target,1,1);
    }
    void check_combination_operation_all(int no1, int no2, int no3, int no4, int target) {
        int temp_var_swap;
        check_combination_operation(no1,no2,no3,no4,target);
        temp_var_swap = no3;
        no3 = no4;
        no4 = temp_var_swap;
        check_combination_operation(no1,no2,no3,no4,target);
        temp_var_swap = no2;
        no2 = no3;
        no3 = no4;
        no4 = temp_var_swap;
        check_combination_operation(no1,no2,no3,no4,target);
        temp_var_swap = no1;
        no1 = no2;
        no2 = no3;
        no3 = no4;
        no4 = temp_var_swap;
        check_combination_operation(no1,no2,no3,no4,target);
    }
    void check_combination_operation(int no1, int no2, int no3, int no4, int target) {
        if((no1 + no2 + no3 * no4) == target)
            System.out.println(no1 + "+" + no2 + "+" + no3 + "*" + no4 + "=" + target);
        else if(no1+no2*no3+no4 == target)
            System.out.println(no1 + "+" + no2 + "*" + no3 + "+" + no4 + "=" + target);
        else if(no1*no2+no3+no4 == target)
            System.out.println(no1 + "*" + no2 + "+" + no3 + "+" + no4 + "=" + target);
        else if(no1*no2*no3+no4 == target)
            System.out.println(no1 + "*" + no2 + "*" + no3 + "+" + no4 + "=" + target);

        else if(no1-no2-no3*no4 == target)
            System.out.println(no1 + "-" + no2 + "-" + no3 + "*" + no4 + "=" + target);
        else if(no1-no2*no3-no4 == target)
            System.out.println(no1 + "-" + no2 + "*" + no3 + "-" + no4 + "=" + target);
        else if(no1*no2-no3-no4 == target)
            System.out.println(no1 + "*" + no2 + "-" + no3 + "+" + no4 + "=" + target);
        else if(no1*no2*no3-no4 == target)
            System.out.println(no1 + "*" + no2 + "*" + no3 + "-" + no4 + "=" + target);

       else if(no1/no2/no3*no4 == target)
            System.out.println(no1 + "/" + no2 + "/" + no3 + "*" + no4 + "=" + target);
        else if(no1/no2*no3/no4 == target)
            System.out.println(no1 + "/" + no2 + "*" + no3 + "/" + no4 + "=" + target);
        else if(no1/no2*no3*no4 == target)
            System.out.println(no1 + "*" + no2 + "/" + no3 + "/" + no4 + "=" + target);
        else if(no1*no2*no3/no4 == target)
            System.out.println(no1 + "*" + no2 + "*" + no3 + "/" + no4 + "=" + target);

        else if(no1+no2+no3-no4 == target)
            System.out.println(no1 + "+" + no2 + "+" + no3 + "-" + no4 + "=" + target);
        else if(no1+no2-no3+no4 == target)
            System.out.println(no1 + "+" + no2 + "-" + no3 + "+" + no4 + "=" + target);
        else if(no1-no2+no3+no4 == target)
            System.out.println(no1 + "-" + no2 + "+" + no3 + "+" + no4 + "=" + target);
        else if(no1-no2-no3+no4 == target)
            System.out.println(no1 + "-" + no2 + "-" + no3 + "+" + no4 + "=" + target);

        else if(no1-no2-no3/no4 == target)
            System.out.println(no1 + "-" + no2 + "-" + no3 + "/" + no4 + "=" + target);
        else if(no1-no2/no3-no4 == target)
            System.out.println(no1 + "-" + no2 + "/" + no3 + "-" + no4 + "=" + target);
        else if(no1/no2-no3-no4 == target)
            System.out.println(no1 + "/" + no2 + "-" + no3 + "-" + no4 + "=" + target);
        else if(no1/no2/no3-no4 == target)
            System.out.println(no1 + "/" + no2 + "/" + no3 + "-" + no4 + "=" + target);

        else if(no1/no2/no3+no4 == target)
            System.out.println(no1 + "/" + no2 + "/" + no3 + "+" + no4 + "=" + target);
        else if(no1/no2+no3/no4 == target)
            System.out.println(no1 + "/" + no2 + "+" + no3 + "/" + no4 + "=" + target);
        else if(no1/no2+no3+no4 == target)
            System.out.println(no1 + "+" + no2 + "/" + no3 + "/" + no4 + "=" + target);
        else if(no1+no2+no3/no4 == target)
            System.out.println(no1 + "+" + no2 + "+" + no3 + "/" + no4 + "=" + target);
    }
    void check_single_digit_addition(int no1, int no2, int no3, int no4, int target) {
        if (no1 + no2 + no3 + no4 == target) {
            System.out.println(no1 + "+" + no2 + "+" + no3 + "+" + no4 + "=" + target);
        }}
    void check_single_digit_multiplication(int no1, int no2, int no3, int no4, int target) {
        if (no1 * no2 * no3 * no4 == target) {
            System.out.println(no1 + "*" + no2 + "*" + no3 + "*" + no4 + "=" + target);
        }
    }
    void check_single_digit_subtraction(int no1, int no2, int no3, int no4, int target, int count, int localcount) {
        int tempvarforswap;
        if (no1 - no2 - no3 - no4 == target) {
            System.out.println(no1 + "-" + no2 + "-" + no3 + "-" + no4 + "=" + target);
        }
        if (localcount == 4)
            return;
        switch (count) {
            case 1:
                tempvarforswap = no3;
                no3 = no4;
                no4 = tempvarforswap;
                check_single_digit_subtraction(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 2:
                tempvarforswap = no2;
                no2 = no4;
                no4 = tempvarforswap;
                check_single_digit_subtraction(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 3:
                tempvarforswap = no2;
                no2 = no3;
                no3 = tempvarforswap;
                check_single_digit_subtraction(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 4:
                tempvarforswap = no2;
                no2 = no3;
                no3 = no4;
                no4 = tempvarforswap;
                check_single_digit_subtraction(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 5:
                tempvarforswap = no1;
                no1 = no2;
                no2 = no3;
                no3 = no4;
                no4 = tempvarforswap;
                check_single_digit_subtraction(no1, no2, no3, no4, target, 1, ++localcount);
                break;
        }
    }
    void check_single_digit_division(int no1, int no2, int no3, int no4, int target, int count, int localcount) {
        int tempvarforswap;
        if (no1 / no2 / no3 / no4 == target) {
            System.out.println(no1 + "/" + no2 + "/" + no3 + "/" + no4 + "=" + target);
        }
        if (localcount == 4)
            return;
        switch (count) {
            case 1:
                tempvarforswap = no3;
                no3 = no4;
                no4 = tempvarforswap;
                check_single_digit_division(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 2:
                tempvarforswap = no2;
                no2 = no4;
                no4 = tempvarforswap;
                check_single_digit_division(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 3:
                tempvarforswap = no2;
                no2 = no3;
                no3 = tempvarforswap;
                check_single_digit_division(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 4:
                tempvarforswap = no2;
                no2 = no3;
                no3 = no4;
                no4 = tempvarforswap;
                check_single_digit_division(no1, no2, no3, no4, target, ++count, localcount);
                break;
            case 5:
                tempvarforswap = no1;
                no1 = no2;
                no2 = no3;
                no3 = no4;
                no4 = tempvarforswap;
                check_single_digit_division(no1, no2, no3, no4, target, 1, ++localcount);
                break;
        }
    }
}
