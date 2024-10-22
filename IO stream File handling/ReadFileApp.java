import java.io.*;
public class ReadFileApp
{
public static void main(String x[])throws FileNotFoundException,IOException,InterruptedException
	{
       FileReader fr = new FileReader("D:\\dec2023\\demo\\third.txt");
		BufferedReader br= new BufferedReader(fr);
		String  data;
		while((data=br.readLine())!=null)
		{
		   System.out.println(data);
		   Thread.sleep(1000);
		}
		System.out.println(data);
	}
}
