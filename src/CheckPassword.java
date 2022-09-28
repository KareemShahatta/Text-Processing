import java.util.Scanner;

/**
 * Imagine you are developing a software package for Amazon.com
 * that requires users to enter their own passwords. 
 * Your software requires that users' passwords meet the following
 * criteria:
 * (1) The password should be at least six characters long
 * (2) The password should contain at least one uppercase and
 * at least one lowercase letter
 * (3) The password should have at least one digit
 * (4) If the password meet the requirement, please display 
 * "true", otherwise, display "false".
 * Please write a program and name it CheckPassword.java
 * For example:
 * Example 1:
 * input: "1234"
 * output: false
 * Example 2: "Abc123!"
 * output: true
 */

public class CheckPassword {


    public static void main(String[] args)
    {
        CheckPassword checkPassword = new CheckPassword();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        System.out.println((checkPassword.checkLength(input) && checkPassword.checkUpperrCase(input) && checkPassword.checkLowerCase(input) && checkPassword.checkDigits(input)));
    }

    private boolean checkLength(String password)
    {
        if(password.length() >= 6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean checkUpperrCase(String password)
    {
        for(Character letter : password.toCharArray())
        {
            if(Character.isUpperCase(letter))
            {
                return true;
            }
        }

        return false;
    }

    private boolean checkLowerCase(String password)
    {
        for(Character letter : password.toCharArray())
        {
            if(Character.isLowerCase(letter))
            {
                return true;
            }
        }

        return false;
    }

    private boolean checkDigits(String password)
    {
        for(Character letter : password.toCharArray())
        {
            if(Character.isDigit(letter))
            {
                return true;
            }
        }

        return false;
    }

}