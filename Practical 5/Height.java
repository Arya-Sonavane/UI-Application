import java.util.*;
public class Height
{
    public static void main(String x[])
    {
         Scanner xyz = new Scanner(System.in);
         System.out.println("Enter person height in centimeters ");
         float height= xyz.nextFloat();

         String result= perHeight< 150 ? "The person is Dwarf" :
                        perHeight>= 150 && perHeight<165 ? "The persong is average heighted" :
                        perHeight>= 165 && perHeight <= 195 ? "The person is taller":"no" ;


        System.out.println(result);

     }
}