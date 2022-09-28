import java.util.Scanner;

/**
 * Balanced strings are those who have equal quantity of "L" and
 * "R" characters. Given a balanced string s split it in the maximum
 * amount of balanced strings. Return the maximum amount of splitted
 * balanced strings
 * Example 1:
 * input: "RLRRLLRLRL"
 * output: 4
 * Explanation: "RLRRLLRLRL" can be split into "RL", "RRLL", "RL", "RL",
 * since each substring contains the same number of "L" and R"
 * Example 2:
 * input: "RLLLLRRRLR"
 * output: 3
 * Explanation: "RLLLLRRRLR" can be split into "RL", "LLLRRR","LR",
 * since each substring contains the same number of "L" and "R"
 * Example 3:
 * input: "LLLLRRRR"
 * output: 1
 * Explanation: "LLLLRRRR" can be split into "LLLLRRRR"
 * Example 4:
 * input: "RLRRRLLRLL"
 * output: 2
 * Explanation: "RLRRRLLRLL" can be split into "RL", "RRRLLRLL",
 * since each substring contains the same number of "L" and "R"
 * Please write a program to achieve this goal and name it CountBalancedStrings.java
 */

public class CountBalancedStrings {

    public static void main(String[] args)
    {
        CountBalancedStrings Cb = new CountBalancedStrings();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        System.out.println(Cb.countLetters(input));
    }

    public int countLetters(String text)
    {
        int value = 0;
        int rCount = 0;
        int lCount = 0;
        int index = 0;

        while(!text.isBlank())
        {
            char[] letters = text.toCharArray();

            if(Character.toUpperCase(letters[index])  == 'R')
            {
                rCount++;
            }
            else if(Character.toUpperCase(letters[index])  == 'L')
            {
                lCount++;
            }


            if(rCount == lCount)
            {
                text = text.substring(index + 1, text.length());

                value++;
                rCount = 0;
                lCount = 0;
                index = 0;
            }
            else
            {
                index++;
            }
        }

        return value;
    }
}