public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        String res = text.toLowerCase().replaceAll("[^a-zA-Z1-9]", "");
        StringBuilder sb = new StringBuilder(res);

        return res.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
        System.out.println();
    }
}
