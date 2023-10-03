import java.util.Scanner;

public class q1 {
    public static int[] mergeArray(int arr1[], int arr2[]) {

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int newArrayLength = arr1Length + arr2Length;
        int [] arr = new int[newArrayLength];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1Length && j < arr2Length) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
                
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < arr1Length) {

            arr[k++] = arr1[i++];

        }
        while (j < arr2Length) {

            arr[k++] = arr2[j++];

        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms for 1st Array:");
        int arrayLength1 = input.nextInt();
        int[] arr1 = new int[arrayLength1];
        System.out.println("enter terms of array in sorted order:");
        for (int i = 0; i < arrayLength1; i++) {
            
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter number of terms for 2nd Array:");
        int arrayLength2 = input.nextInt();
        int[] arr2 = new int[arrayLength2];
        System.out.println("enter terms of array in sorted order:");
        for (int i = 0; i < arrayLength2; i++) {
            arr2[i] = input.nextInt();
        }
        int [] result = mergeArray(arr1, arr2);
        System.out.println("the elements of merged array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        input.close();
    }
}