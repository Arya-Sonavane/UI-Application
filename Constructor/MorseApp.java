import java.util.*;
class Morse
{ int num;
 Morse(int num)
 {
   this.num=num;
 }
 void show()
 {
   while(num!=0)
   {
     int no=num%10;
   
        
    switch(no){
      case 0:
           System.out.print("-----");
           break;
      case 1:
           System.out.print(".----");
           break;
      case 2:
           System.out.print("..---");
           break;
      case 3:
           System.out.print("...--");
           break;
      case 4:
           System.out.print("....-");
           break;
      case 5:
           System.out.print(".....");
           break;
      case 6:
           System.out.print("-....");
           break;
      case 7:
           System.out.print("--...");
           break;
      case 8:
           System.out.print("---..");
           break;
      case 9:
           System.out.print("----.");
           break;
      default:
           System.out.print("Invalid input....please enter number between 0 to 9");
           break;
           
           
       }
     num=no/10;
      
    System.out.println("Morse code of number is ");
     
    }
 
   }
 }  

 
public class MorseApp
{
  public static void main(String x[])
  {
    Scanner xyz= new Scanner(System.in);
    System.out.println("Enter a number"); 
    int no=xyz.nextInt();

    Morse m= new Morse(no);
    m.show();

    
  }

}