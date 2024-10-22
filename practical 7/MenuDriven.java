import java.util.*;
public class MenuDriven
{
     public static void main(String x[])
     {
     int a,b,c;
  
     Scanner xyz=new Scanner(System.in);
     System.out.println("Check no is divisible by 5 and 11 or not");
     System.out.println("check triangle is equilateral, isoscale or scalene");
     System.out.println("check year is leap year or not");
     System.out.println("check its alphabet, vowel or consonant ");
     System.out.println("check its alphabet, digit or special character ");
     System.out.println("Enter choice");
     int choice= xyz.nextInt();

     switch(choice)
     {
          case 1: 
              System.out.println("enter number");
               String result = a%5==0 && a%11==0 ?"no is divisible by 5 and 11": "no is not divisible by 5 and 11";
             System.out.println("result is");
          break;
         
           case 2: 
              System.out.println("enter three values for traiangle ");
              a=xyz.nextInt();
              b=xyz.nextInt();
              c=xyz.nextInt();
             String  result = (a==b) && (b==c) && (a==c)? "Triangle is equilateral":
                        (a==b) || (a!=c)? "Triangle is isoscale":"Triangle is scalene";
              System.out.println("result");
              break;

           case 3:
              System.out.println("Enter year");
              a= xyz.nextInt();
              String result = a%4==0 ?"its leap year":"its not leap year";
              System.out.println("result");
             break;

           case 4:
              System.out.println("Enter alphabet");
              char ch = xyz.charAt(0); 
  
             String result = ch== 'a' || ch== 'e' ||  ch== 'i' || ch== 'o' || ch== 'u'? "it is vowel" :  "it is consonant";
              System.out.println(result);
              System.out.println("result is");
           break;
          
           case 5:
             System.out.println("Enter number");
             char ch=xyz.charAt(0);
             String result= ch>= 'a' && ch<='z' ? "this is alphabet" :(ch>='0' && ch<='9' ? "It is number" : "It is Special character");
             System.out.println("result is");
             break;
         
           default:
              System.out.println("wrong choice");
          }
     }
}
            
              


            

     
   
     
     