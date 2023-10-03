import java.util.*;

public class q6 {
    public static String read_Sentence() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence:");
        String sentence = input.nextLine();
        input.close();
        return sentence;

    }

    public static void longestWord(String sentence) {
        int start = 0;
        int end = 0;
        int count = 0;
        int maxstart = 0;
        int maxend = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '.') {
                end = i-1;
                // System.out.println(start+" "+end);
                int diff = end-start+1;
                if(diff>count)
                {
                    maxstart=start;
                    maxend=end;
                    count = diff;
                }
                start = i+1;
            }
        }
        if(maxstart==maxend)
        {
            System.out.println(sentence);
        }
        else
            System.out.println("Longest Word is "+sentence.substring(maxstart, maxend + 1));

    }

    public static void pangram(String sentence) {
        int start = 0;
        int end = 0;
        int []arr = new int[26];

        int length = sentence.length();
        for (int i = 0; i < length; i++) {
            if(sentence.charAt(i)>'z' || sentence.charAt(i)<'a')
            continue;
            int index = sentence.charAt(i)-'a';
            arr[index]=1;
        }

        int check = 1;
        for(int i = 0;i<26;i++)
        {
            if(arr[i]!=1)
            {
                check = 0;
                break;
            }
        }

        if(check==1)
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }

    }

    public static void main(String[] args) {
        String sentence = read_Sentence();
        longestWord(sentence);
        // System.out.println("Pallindrome words are:");
        pangram(sentence);

    }

}
