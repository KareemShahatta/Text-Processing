import java.util.Scanner;

/*
 * Remove duplicate letters in a string.
 * Givin a string S of lowercase letters, a duplicate removal
 * consists of choosing two adjacent and equal letters, and removing them.
 * We repeatedly make duplicate removals on S until we no longer can.
 * Return the final string after all such duplicate removals have been made.
 * Example 1
 * input: "xyyxzx"
 * output: "zx"
 * Explanation: In "xyyxzx", the first round removeal is "yy".
 * After "yy" has been removed, the string is "xxzx". Then, in the next round,
 * "xx" will be removed. "zx" is the final result.
 * Please name your java file as RemoveDuplicates.java
 */

public class RemoveDuplicates {

    public static void main(String[] args)
    {
        RemoveDuplicates RD = new RemoveDuplicates();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(RD.removeDuplication(input , 0));
    }

    public String removeDuplication(String text , int index)
    {
        char[] letters = text.toCharArray();

        if(index < letters.length && index + 1 < letters.length)
        {
            if(letters[index] == letters[index + 1])
            {
                String targetString = letters[index] + "" + letters[index];
                text = text.replaceFirst(targetString, "");
                text = removeDuplication(text, 0);
            }
            else
            {
                text = removeDuplication(text, index + 1);
            }

        }

        return text;
    }
}