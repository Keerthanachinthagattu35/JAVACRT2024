import java.util.*;
class Continue1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
       int i;
       for(i=1;i<=10;i++)
       {
           System.out.println(i);
       if(i%3==0)
       continue;
        System.out.println("java");
        System.out.println("python");
       }
    }
}