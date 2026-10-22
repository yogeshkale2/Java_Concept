public class ReverseWords {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        // Traverse backwards from right to left
        while (i >= 0) {
            // Skip trailing or consecutive spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;

            int end = i;
            // Find start of the current word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(s.substring(i + 1, end + 1));
        }

        return sb.toString();
    }

    // Main method to run and test the function
    public static void main(String[] args) {
        String test1 = "the sky is blue";
        String test2 = "  hello world  ";
        String test3 = "a good   example";

        System.out.println("Output 1: \"" + reverseWords(test1) + "\""); // "blue is sky the"
        System.out.println("Output 2: \"" + reverseWords(test2) + "\""); // "world hello"
        System.out.println("Output 3: \"" + reverseWords(test3) + "\""); // "example good a"
    }
}