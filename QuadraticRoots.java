import java.util.*;
public class QuadraticRoots
{
        public static void main(String x[])
         
        {
             Scanner xyz= new Scanner(System.in);
             System.out.println("Input of a");
             double a= xyz.nextDouble();
             System.out.println("Input of b");
             double b= xyz.nextDouble();
             System.out.println("Input of c");
             double c= xyz.nextDouble();

             double D= (b*b) - 4*a*c;
             if(D<0)
             {
             System.out.println("No Real roots");
             }
             else if(D>0)
             {
             double root1 = (-D + Math.sqrt(D)) /(2*a);
             double root2 = (-D - Math.sqrt(D)) /(2*a);
             System.out.println("Root1 = "+ root1);
             System.out.println("Root2 ="+ root2);
             }
             else if(D==0)
             {
             double root = -D/(2*a);
             System.out.println("Roots are real and equal" +root);
             }
       }
}


             
              