//accept file path using string format

import java.util.*;
import java.io.*;

public class FileWriterApp
{
  public static void main(String x[])
  {
    FileWriter f=new FileWriter(C:\Users\hp\Desktop\Java practice examples);
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter String data");
    
    String dd=xyz.nextLine();
    f.write(dd);
    f.close();

    System.out.println("File save success....");
    
    
  } 	

}