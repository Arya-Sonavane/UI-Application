import java.util.*;
public class Marks

{

   public static void main(String x[])
   {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter marks for sub1");
        int sub1 = xyz.nextInt();
        System.out.println("Enter marks for sub2");
        int sub2 = xyz.nextInt();
        System.out.println("Enter marks for sub3");
        int sub3 = xyz.nextInt();
        System.out.println("Enter marks for sub4");
        int sub4 = xyz.nextInt();
        System.out.println("Enter marks for sub5");
        int sub5 = xyz.nextInt();
        System.out.println("Enter marks for sub6");
        int sub6 = xyz.nextInt();

        int total = sub1+sub2+sub3+sub4+sub5+sub6;

        int Avg,per;
        
        Avg=  total/6;
        per= (total*100)/600;

        System.out.println("sub Avg"+ Avg);
        System.out.println("sub per"+ per);
    }
}        