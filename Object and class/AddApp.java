
class Add
{
  int a,b;

 void SetValue(int x,int y)
{
  a=x;
  b=y;
}
void showDetails()
{
  System.out.printf("Addition is %d\n", a+b);
}

}

public class AdditionApp
{
  public static void main(String x[])
  {
    
   
     
    Add p = new Add();
    p.SetValue(10,20);
   

    Add a1=p;
    a1.SetValue(20,30);

    p.showDetails();  
  }
}