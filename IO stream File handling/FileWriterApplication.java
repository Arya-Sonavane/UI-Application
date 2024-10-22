
import java.io.*;
import java.util.*;
public class FileWriterApplication
{
    public static void main(String x[])throws Exception
	{   File f = new File("D:\\dec2023\\demo\\first.txt");
		FileWriter fw = new FileWriter(f);
		Scanner xyz  = new Scanner(System.in);
		System.out.println("enter string data");
		String data=xyz.nextLine();
		fw.write(data);
		fw.close();
		System.out.println("File Save Success.............");
	}
}
