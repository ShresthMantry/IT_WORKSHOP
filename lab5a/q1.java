import java.util.Scanner;
class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        double sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("The Average is "+sum/n);
        sc.close();
    }

}
