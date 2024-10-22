import java.util.Scanner;
public class MissingElements
{
   public static void main(String args[])
   {
	int [] a={1 , 5 , 9 , 13 , 17};
	
	for(int i=0; i<a.length-1; i++)
	{
	   int no=a[i];
	   for(int j=no; j<a[i+1]; j++)
	   {
	     if(j!=no)
	     {
		  System.out.printf("%d\t", j);
	     }
	   }
	}
   }
}