import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class ArrayList2{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
ArrayList<Integer> a1= new ArrayList<>();

for(int i=0;i<n;i++)
{
a1.add(a[i]);
}
ArrayList <Integer> a2= new ArrayList<>();
for(int x:a1)
{
if(!(a2.contains(x)))
a2.add(x);
}
System.out.println(a2);
int c=0;
for(Integer x:a2)
{
    c=0;
    for(Integer r:a1)
    {
        if(x==r)
        c++;
    }
    System.out.println(x+" "+c);
}
}
}