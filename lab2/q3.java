import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        int check = 1;
        while(start<=end)
        {
            if(arr[start]!=arr[end])
            {
                check = 0;
                break;
            }
            start++;
            end--;
        }

        if(check==0)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
        sc.close();
    }
}
