import java.util.Scanner;

public class q4 {
    public static int[] merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];

        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else if (arr[right] < arr[left]) {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return arr;
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if(low==high)
        {
            return;
        }
        int mid = (high + low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static int solve(int []arr) {
        int start = 0;
        int end = arr.length-1;
        int mini = arr[end]+arr[start];
        while(start<=end)
        {
            int sum = arr[end]+arr[start]>0?arr[end]+arr[start]:(arr[end]+arr[start])*-1;
            if(sum==0)
            {
                return 0;
            }
            else if(sum<0)
            {
                mini = sum<mini?sum:mini;
                start++;
            }
            else if(sum>0)
            {
                mini = sum<mini?sum:mini;
                end--;
            }
        }

        return mini;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n-1);
        int ans = solve(arr);
        System.out.println(ans);
        sc.close();
    }
}
