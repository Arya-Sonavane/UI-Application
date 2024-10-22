class Multiplication
{
  int a,b;

void setValue(int x, int y)
{
  a=x;
  b=y;
  
}
void showMultiplication()
{
  System.out.printf("Multiplication is %d\n", a*b);
}

}

public class MultiplicationApp
{
  public static void main(String x[])
  {
    Multiplication m = new Multiplication();
    m.setValue(1,2);
    m.showMultiplication();
  }
}