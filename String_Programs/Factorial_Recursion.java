public class Factorial_Recursion
{
    static int ans=1;
    public static int factorial(int n) 
    {
       
        
        if (n == 0 || n == 1)
        {
            return 1;
        }
        
        ans= n * factorial(n - 1);
        return ans;
    }

    public static void main(String[] args)
    {
        int number = 5;  
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
