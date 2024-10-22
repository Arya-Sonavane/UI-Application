import java.util.*;
class CompareString
{

	char ch1[],ch2[];
	void setCharArray(char ch1[],char ch2[])
        {
		this.ch1=ch1;
		this.ch2=ch2;
	}
	
	boolean compare()
        {
		boolean b=false;
	
	    for(int i=0;i<ch1.length;i++)
	    {
		
		if(ch1[i]==ch2[i])
		{
		 	b=true;
		 	System.out.println("================");
			
		}
		else
		{
		System.out.println("********************");
			b=false;
			break;
		}

	     }
	
      
	
	return b;	
        }


}

class StringCompareApp
{
	public static void main(String arr[])
        {
	Scanner s=new Scanner(System.in);
	 char ch1[],ch2[];
	 String str,str2;
	 System.out.println("Enter Strings");
	str=s.nextLine();
	str2=s.nextLine();
	ch1=str.toCharArray();
	ch2=str2.toCharArray();
	CompareString cs=new CompareString();
	cs.setCharArray(ch1,ch2);
	boolean b=cs.compare();
	if(b)
	{
	System.out.println("Equal");
         }
	else
        {
		System.out.println("Not Equal");
	}
	



	}
}