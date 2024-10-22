import java.util.*;
public class Speed
{

     public static void main(String x[])
     {
     Scanner xyz = new Scanner(System.in);
     System.out.println("Enter Distance D is");
     float d = xyz.nextFloat();
        
     System.out.println("Enter Time T is");
     float t = xyz.nextFloat();

     float Speed= d/t;
     System.out.println("Total speed is"  +Speed);
     }
}

     