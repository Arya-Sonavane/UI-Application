import java.util.*;
class ArithematicOperation
{
    int a,b;
    void setValue(int x , int y)
    {
         a=x;
         b=y;
            
    }
    void showAdd()
    {
      System.out.println("Addition is %d\n",a+b);
      System.out.println("Substraction is %d\n",a-b);
      System.out.println("Multiplication is %d\n",a*b);
      System.out.println("Division is %d\n",a/b);
    }
      public class ArithematicApp
      {
         public static void main(String x[])
         {
               Scanner xyz=new Scanner(System.in);
               int a=xyz.nextInt();
               int b=xyz.nextInt();

           ArithematicOperation ref= new ArithematicOperation();
           ref.setValue(a,b);
           ref.showValue();
         }

      }
    

} 