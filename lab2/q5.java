import java.util.Scanner;

public class q5 {
    public static void BUILD_ARRAY(int arr[], int arrayLength) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = input.nextInt();
        }

    }

    public static void reverse(int arr[], int arrayLength) {
        int start = 0;
        int end = arrayLength-1;
        while(start<=end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int arrayLength = input.nextInt();
        int[] arr = new int[arrayLength];
        BUILD_ARRAY(arr, arrayLength);
        reverse(arr, arrayLength);

        for(int i  =0;i<arrayLength;i++)
        {
            System.out.print(arr[i]+" ");
        }

        input.close();

    }
}
