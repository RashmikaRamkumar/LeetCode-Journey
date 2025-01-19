import java.util.Scanner;

public class FullCode {
    public static class Solution {
        public int lengthOfLastWord(String s) {
            int end = s.length() - 1;
            while (end >= 0 && s.charAt(end) == ' ')
                end--;
            int start = end;
            while (start >= 0 && s.charAt(start) != ' ')
                start--;
            return end - start;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        Solution solution = new Solution();
        int result = solution.lengthOfLastWord(input);

        System.out.println("Length of the last word: " + result);
    }
}
