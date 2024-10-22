import java.util.*;
public class PrimeFactors
{
        public static void main(String x[])
        {
           Scanner xyz= new Scanner(System.in);
           System.out.println("Enter No");
           int No= xyz.nextInt();
           int i=1;

           do
           {
             int div=2, count=0;
           
            do
           {
             if(i%div==0) {count++;}
            
             div++; 
           }
            while(div<=No);
           
            System.out.print(" "+(count==1 ?( No%i==0)? i: " " : " "));
            i++;
          }
           while(i<No);
          }
}