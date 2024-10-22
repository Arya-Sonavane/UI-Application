
interface NumberOperation 
{
    public static final int a=10;
    void setNum(int no); // public abstract void setNum()
    int getResult();   


}
class CountDigit implements NumberOperation
{
   int n;
   int count=0;                                        
   public void setNum(int no)  
   {
     n=no;
   }
   public int getResult()
   {
      while(n!=0)
      {
        int iDigit=n%10;
        count++;
        n=n/10;
      }
      return count;
   }
}
public class Wrapper
{
    public static void main(String arg[])
    {
        NumberOperation ref=new CountDigit(); //Dynamic biding means interface reference and the class which impliment that interface object.
        ref.setNum(123);
        int result=ref.getResult();
        System.out.println(result);
    }
}
