public class StringUtilsTest {

      public void testReverse() {
          String result = StringUtils.reverse("hello");
          if (!result.equals("olleh"))
              throw new RuntimeException("Expected \"olleh\" but got \"" + result + "\"");

          if (!StringUtils.reverse("").equals(""))
              throw new RuntimeException("Expected empty string for empty input");
      }

      public void testIsPalindrome() {
          if (!StringUtils.isPalindrome("racecar"))
              throw new RuntimeException("Expected true for \"racecar\"");

          if (StringUtils.isPalindrome("hello"))
              throw new RuntimeException("Expected false for \"hello\"");

          if (!StringUtils.isPalindrome(""))
              throw new RuntimeException("Expected true for empty string");
      }
  }
