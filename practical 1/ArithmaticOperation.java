public class ArithmaticOperation //Q3

{

       public static void main(String x[])
       {
              int a = Integer.parseInt (x[0]);
              int b = Integer.parseInt (x[1]);
                
              int Add = a+b;
              int Sub = a-b;
              int Mul = a*b;
              int Div = a/b;

              System.out.println("Addition is" + Add);
              System.out.println("Substraction is" + Sub);
              System.out.println("Multiplication is" + Mul);
              System.out.println("Division is" + Div);


        }
}