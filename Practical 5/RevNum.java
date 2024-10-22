import java.util.*;
public class RevNum
{

     public static void main(String x[])
     {
            Scanner xyz= new Scanner(System.in);
            System.out.println("Enter number");
            int no=xyz.nextInt();

            System.out.printf("Before reverse is %d\n",no);
            int rev=(no%10)*100+((no/10)%10)*10+no/100;
            System.out.printf("After reverse is %d\n",rev);

      }
}
