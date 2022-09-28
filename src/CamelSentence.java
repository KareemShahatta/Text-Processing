import java.util.Scanner;

/**
 * In this program, please 
 * (1) Accept a string such as "StopAndSmellTheRoses."
 * (2) Convert the string to a sentence in which the words are
 *     separated by spaces and only the first word starts with
 *     an uppercase letter
 * (3) display the string
 * (4) please name your java source file as CamelSentence.java
 * For example:
 * Example 1:
 * input:StopAndSmellTheRoses.
 * output:Stop and smell the roses.
 * Example 2:
 * input:KnowledgeIsPower.
 * output:Knowledge is power.
 */

public class CamelSentence {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        StringBuffer customString = new StringBuffer();

        for(int i = 0 ; i < input.length() ; i++)
        {
            Character letter = input.charAt(i);

            if(i == 0)
            {
                customString.append(letter);
            }
            else
            {
                if(Character.isUpperCase(letter))
                {
                    customString.append(" ");
                }

                customString.append(Character.toLowerCase(letter));
            }
        }

        System.out.println(customString);
    }
}