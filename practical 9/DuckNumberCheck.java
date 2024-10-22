import java.util.*;
public class DuckNumberCheck
{
     public static void main(String x[])
    {
          int no,j=1,count;
          Scanner xyz=new Scanner(System.in);
          System.out.println("Enter a number");
          no=xyz.nextInt();
          flag=true;
          while(j<=no)
          {  
           temp=j; 
           count=0;       

          while(temp!=0)
          {     
               count++;
               int temp=temp%10;
               if(temp==0)
               {
                cnt++;
                }
                temp=temp/10;
            
          }
            flag=false;
          

             
          if(no==j)
          {
             System.out.println(j);
          }
          j++;
        }
    }
  
}