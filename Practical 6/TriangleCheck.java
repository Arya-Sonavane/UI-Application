import java.util.*;
public class TriangleCheck
{
    public static void main(String x[])
    {
    int a,b,c;
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter value a");
    a= xyz.nextInt();
    System.out.println("Enter value b");
    b= xyz.nextInt();
    System.out.println("Enter value c");
    c= xyz.nextInt();

    if((a==b) && (b==c) && (a==c))
    {
       System.out.println("Triangle is Equilateral");
    }
    else if(a==b || b==c || a==c)
    {
       System.out.println("Triangle is Isoscale");
    }else
    {
       System.out.println("Triangle is Scalene");
    }
    }
}
  
    

