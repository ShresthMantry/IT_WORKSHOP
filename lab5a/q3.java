import java.util.Scanner;

public class q3 {
    public static void buildArray(int []arr,int n)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static int solve(int []arr,int n)
    {
        int mini = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<mini)
            {
                mini = arr[i];
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        buildArray(arr,n);
        int mini = solve(arr,n);
        System.out.println("The minimum element is "+mini);
    }
}
