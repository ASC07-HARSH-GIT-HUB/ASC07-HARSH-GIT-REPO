package lab1;

public class StringMethodsTest {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";

        System.out.println("charAt(6): " + str.charAt(6));
        System.out.println("contains(\"Java\"): " + str.contains("Java"));
        System.out.println("length(): " + str.length());
        System.out.println("indexOf(\"Java\"): " + str.indexOf("Java"));
        System.out.println("equals(\"hello\"): " + str.equals("hello"));
        System.out.println("equalsIgnoreCase(\"  hello java world  \"): " + str.equalsIgnoreCase("  hello java world  "));
        System.out.println("join: " + String.join(" - ", "Java", "Python", "C++"));
        System.out.println("lastIndexOf(\"o\"): " + str.lastIndexOf("o"));
        System.out.println("substring(2, 7): " + str.substring(2, 7));
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("trim(): '" + str.trim() + "'");
    }
}
