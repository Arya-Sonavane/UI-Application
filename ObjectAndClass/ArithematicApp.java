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
      System.out.println("Addition is"+(a+b));
      System.out.println("Substraction is"+(a-b));
      System.out.println("Multiplication is"+(a*b));
      System.out.println("Division is"+(a/b));
    }
}
      public class ArithematicApp
      {
         public static void main(String x[])
         {
               Scanner xyz=new Scanner(System.in);
		System.out.println("Enter values");
               int a=xyz.nextInt();
               int b=xyz.nextInt();

           ArithematicOperation ref= new ArithematicOperation();
           ref.setValue(a,b);
           ref.showAdd();
         }

      }