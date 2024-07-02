import java.util.*;
class Splitstr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="Java is simple Language";
        String res[]=str.split(" ");
        System.out.println(Arrays.toString(res));
           String res1[]=str.split("is");
            System.out.println(Arrays.toString(res1));
    }
}