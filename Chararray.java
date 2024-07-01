import java.util.*;
class Chararray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char s2[]=s1.toCharArray();
        System.out.println(s1);
        System.out.println(Arrays.toString(s2));
        for(int i=0;i<s1.length();i++)
        {
            System.out.println(s2[i]);
        }
    }
}