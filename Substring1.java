import java.util.*;
class Substring1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="Java is simple Language";
        System.out.println(str.contains("simple"));
        System.out.println(str.contains("Python"));
        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("age"));
        System.out.println(str.startsWith("k"));
    }
}