import java.util.*;
public class Percentage
{
    public static void main(String x[])
    {
      int phy,chem,bio,math,comp ;
      float per;
      Scanner xyz = new Scanner(System.in);
      System.out.println("Enter marks for phy ");
      phy=xyz.nextInt();
      System.out.println("Enter marks for chem ");
      chem=xyz.nextInt();
      System.out.println("Enter marks for bio");
      bio=xyz.nextInt();
      System.out.println("Enter marks for math ");
      math=xyz.nextInt();
      System.out.println("Enter marks for comp ");
      comp=xyz.nextInt();

     int Total=phy+chem+bio+math+comp;
      per=(Total*100)/500;

     if(per>=90)
     {
       System.out.println("Grade A");
     }
     else if(per>=80)
{
       System.out.println("Grade B");
     }
     else if(per>=70)
     {
       System.out.println("Grade C");
    }
    else if(per>=60)
	{
       System.out.println("Grade D");
    }
    else if(per>=40)
	{
       System.out.println("Grade E");
    }
    else if(per<40)
	{
       System.out.println("Grade F");
    }
   }
}