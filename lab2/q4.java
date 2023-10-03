import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=input.nextInt();
        System.out.println("Enter Second number");
        int num2=input.nextInt();

        if(num2==0)
        {
            System.out.println("The second number is 0");
        }
        else if(num1%num2==0)
        {
            System.out.println("Exactly Divisible");
        }
        else
        {
            System.out.println("Not Divisible");
        }

        int c = (num2!=0 && num1%num2==0)?1:num2==0?2:3;
        if(c==1)
        {
            System.out.println("Exactly Divisible");
        }
        else if(c==2)
        {
            System.out.println("The second number is 0");
        }
        else
        {
            System.out.println("Not Divisible");
        }
        input.close();
    }
}
