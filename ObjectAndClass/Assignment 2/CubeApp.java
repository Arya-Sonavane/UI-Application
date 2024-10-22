import java.util.*;
class Cube
{
int num;
void setValue(int x)
{
   num=x;
}
int getCube()
{
 int cube= num*num*num;
 System.out.println("cube is"+cube);
 return cube;
}

}


public class CubeApp
{
 public static void main(String a[])
 {
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter a number");
  // int num=xyz.nextInt();
  int x=xyz.nextInt();
   Cube c= new Cube();
   c.setValue(x);
   c.getCube(); 
 


 }


}