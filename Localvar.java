import java.util.*;
class Sample
{
    int a=10;
    static int b=20;
}
        void show()
        {
            int c=30;
             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
        }
        class Localvar
        {
        public static void main(String[] args)
        {
        Scanner s=new Scanner(System.in);
       Sample s1=new Sample();
       s1.show();
        
    }
}
