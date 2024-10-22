import java.util.*;

public class CheckNumberPerfect{

	
	public static void main(String []args)
	{

		
			
	}

}
/*

	WAP to print 1 to nth Perfect Numbers..
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Range:");

		int range = sc.nextInt();//100 eg . 1 2 6 28 ....
		int i=1;
		while(i<=range)
		{
			int sum=0;
			int j=1;
			while(j<i)
			{
				if(i%j==0)
				//System.out.printf("%d ",j);
				sum+=j;// sum = sum+j;
				j++;
			}
			if(sum==i)
			System.out.printf("no =%d sum = %d \n",i,sum);
		
			i++;
		}

	--------------------------------------------------------

	WAP to print 1 to nth Strong Numbers......

	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Range:");
		int range = sc.nextInt();//1 2 ... 145 ...150
		int i=1;
		while(i<=range)
		{

			int temp  = i;
			int sum=0;
			while(temp!=0)
			{
				int rem = temp%10;//14 5
				int fact =1;
				int j=1;
				while(j<=rem) //  1<=5 1<=4 1<=1
				{
					fact = fact*j;
					j++;
				}				
				sum = sum +fact; // 120+24+1=145

				temp/=10;//0   1  4  5
	
			}
			if(sum==i)
			System.out.printf("no =%d sum = %d \n",i,sum);
			i++;
		}


*/