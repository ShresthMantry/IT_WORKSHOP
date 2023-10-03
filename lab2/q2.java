import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int number = input.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = input.nextInt();
        }
        int []vis = new int[number];
        for(int i = 0;i<number;i++)
        {
            int count = 0;
            if(vis[i]==1)
                continue;
            for(int j = 0;j<number;j++)
            {
                if(arr[i]==arr[j])
                {
                    vis[j]=1;
                    count++;
                }

            }
            System.out.println(arr[i]+" -> "+count);
        }
        input.close();
    }
}
