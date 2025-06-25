import java.util.Scanner;

public class Reversevowel {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (!isVowel(sb.charAt(l)) && isVowel(sb.charAt(r))) {
                l++;
            } else if (isVowel(sb.charAt(l)) && !isVowel(sb.charAt(r))) {
                r--;
            } else if (isVowel(sb.charAt(l)) && isVowel(sb.charAt(r))) {
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;
            } else {
                l++;
                r--;
            }

        }
        s = sb.toString();
        return s;
    }

    public static boolean isVowel(char c) {

        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = reverseVowels(s);
        System.out.print(ans);
    }
}
