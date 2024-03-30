import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {

        // 1. Match character except a,b,c,d
        System.out.println("Result of 1st expression matches positive case: " + Pattern.matches("[^abcd]", "x"));
        System.out.println("Result of 1st expression matches negative case: " + Pattern.matches("[^abcd]", "a"));

        // 2. Match mail address
        System.out.println("Result of 2nd expression matches positive case: " + Pattern.matches("[a-zA-Z0-9._%+-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4}", "mjshen.work@gmail.com"));
        System.out.println("Result of 2nd expression matches negative case: " + Pattern.matches("[a-zA-Z0-9._%+-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4}", "das@c.c"));

        // 3. Match phone numbers
        System.out.println("Result of 3rd expression matches positive case: " + Pattern.matches("\\d{3}-\\d{3}-\\d{4}", "123-123-1234"));
        System.out.println("Result of 3rd expression matches negative case: " + Pattern.matches("\\d{3}-\\d{3}-\\d{4}", "1234-123-123"));

        // 4. Match words start with Ss or Tt
        System.out.println("Result of 4th expression matches positive case: " + Pattern.matches("[SsTt][a-zA-Z]+", "Star"));
        System.out.println("Result of 4th expression matches negative case: " + Pattern.matches("[SsTt][a-zA-Z]+", "runtime"));

        // 5. Match integer numbers
        System.out.println("Result of 5th expression matches positive case: " + Pattern.matches("\\d+", "8848"));
        System.out.println("Result of 5th expression matches negative case: " + Pattern.matches("\\d+", "l"));

        // 6. Match java files
        System.out.println("Result of 6th expression matches positive case: " + Pattern.matches("[a-zA-Z0-9]+\\.java", "main.java"));
        System.out.println("Result of 6th expression matches negative case: " + Pattern.matches("[a-zA-Z0-9]+\\.java", "main.class"));

    }
}
