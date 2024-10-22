class RecursionFibonacci  // function calling from itself
{
    int a=0;
    int b=1;
    static int a=0,b=0,c=0;
    static void Fibonacci(int num)
    {
        if(num>0)    
        {
            c=a+b;    
            a=b;      
            b=c;      
            System.out.println(c);
            Fibonacci(num-1);
        }
    } 
}
public class Recursion
{
    public static void main(String arg[])
    {
        int count=10;
        System.out.println(a);
        System.out.println(b);
        Fibonacci(count-2);
        
    }
}

//Most important code