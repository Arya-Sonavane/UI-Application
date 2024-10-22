
class CompareString
{
  private char a1[];
  private char a2[];

  void setCharArray(char a[], char b[])
  {
      a1=a;
      a2=b;

  }

  boolean compare()
    {
      boolean flag =true;
      if(a1.length!=a2.length)
      {
         flag=false;
      }
        return flag; 
     }
      
}

 public class StringApp
 {
   public static void main(String x[])
   {
    Scanner xyz=new Scanner(System.in);
    char a[]=new char[7];

     for(int i=0; i<a.length; i++)
    {
          a[i]=xyz.next().charAt(0);
     }
   String str= "ABC";
   String str1= "abc";
 
     CompareString cmp= new CompareString();
     cmp.setCharArray(str, str1);
     cmp.CompareString();
   }

 } 

