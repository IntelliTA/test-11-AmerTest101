public class StringUtils {

      public static String reverse(String s) {
          return new StringBuilder(s).reverse().toString();
      }

      public static boolean isPalindrome(String s) {
          return s.equals(reverse(s));
      }
  }