import java.util.*;
public class Course
{
     public static void main(String x[])
     {
            Scanner xyz=new Scanner(System.in);
            int NN,MM,KK;
            int lastSeat;

            System.out.println("Enter friends");
            NN = xyz.nextInt();
            System.out.println("Enter capacity");
            MM = xyz.nextInt();
            System.out.println("Enter students who have alredy enrolled course");
            KK = xyz.nextInt();
            
            lastSeat=MM-KK;

            if(NN<=lastSeat)
            {
              System.out.println("Yes");
            }
            else
            {
              System.out.println("No");
             }
       }
}            
            
            

