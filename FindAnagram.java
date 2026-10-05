
import java.util.Scanner;

class FindAnagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.next();

        System.out.print("Enter word2: ");
        String word2 = sc.next();

        if (word1.length() != word2.length()) {
            System.out.println("Not Anagram");
        } else {
            boolean anagram = true;

            for (int i = 0; i < word1.length(); i++) {
                char ch = word1.charAt(i);

                int count1 = 0;
                int count2 = 0;

                for (int j = 0; j < word1.length(); j++) {
                    if (word1.charAt(j) == ch)
                        count1++;

                    if (word2.charAt(j) == ch)
                        count2++;
                }

                if (count1 != count2) {
                    anagram = false;
                    break;
                }
            }

            if (anagram)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }
}

