import java.util.*;
public class TvVolume
{
    public static void main(String x[])
    {
      int XX,YY;
      Scanner xyz= new Scanner(System.in);
      System.out.println("Enter current volume of TV");
      XX=xyz.nextInt();
      System.out.println("Enter target volume");
      YY=xyz.nextInt();
     

      if(XX>YY)
      { 
        System.out.printf("volume c=%d\n", XX-YY);
      }
      else
      {
        System.out.printf("Volume c=%d\n", YY-XX);
      }
        System.out.printf("Minimum no of button pressess" );
    }
}
     
     

       