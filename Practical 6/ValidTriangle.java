import java.util.*;
public class ValidTriangle
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

    if(a+b>c && b+c>a && c+a>b)
    {
     System.out.println("it is valid triangle");
    }else
    {
     System.out.println("Triangle is not valid");
    }
    }
}