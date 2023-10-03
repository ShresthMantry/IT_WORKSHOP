import java.util.Scanner;

public class q3 {
    public static void zeroEnd(char arr[],int array_length,char ch)
    {
        int i=0;
        int j=0;
        while(j<array_length)
        {
            if(arr[j]==ch)
            {
                j++;
            }
            else
            {
                char temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of terms in Array:");
        int arrayLength = input.nextInt();
        char[] arr = new char[arrayLength];
        System.out.println("enter terms of array:");
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = input.next().charAt(0);
        }
        System.out.println("Enter Character to push at back");
        char ch = input.next().charAt(0);
        zeroEnd(arr, arrayLength,ch);
        System.out.println("the elements of thge array after modification are:");
         for (int i = 0; i < arrayLength; i++) {
            System.out.print(arr[i]+" ");
           
        }
        input.close();
    }
}
