import java.util.Scanner;

public class q2 {
    public static int[] mergeArray(int arr1[], int arr2[]) {

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int newArrayLength = arr1Length + arr2Length;
        int[] arr = new int[newArrayLength];
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

    public static boolean binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;

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

        System.out.println("Enter number of terms for 3rd Array:");
        int arrayLength3 = input.nextInt();
        int[] arr3 = new int[arrayLength3];
        System.out.println("enter terms of array in sorted order:");
        for (int i = 0; i < arrayLength3; i++) {
            arr3[i] = input.nextInt();
        }

        int[] result = mergeArray(arr1, arr2);
        result = mergeArray(result, arr3);
        System.out.println("the elements of merged array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println("");
        System.out.println("Enter k");
        int k = input.nextInt();
        int count = 1;
        

        for (int i = 0; i < result.length; i++) {
            if(count>k)
            {
                break;
            }
            if (i > 0 && result[i] == result[i - 1])
                continue;
            if (binarySearch(arr1, result[i])==true && binarySearch(arr2, result[i])==true && binarySearch(arr3, result[i])==true) {
                count++;
                System.out.print(result[i] + " ");
            }
        }

        input.close();
    }
}