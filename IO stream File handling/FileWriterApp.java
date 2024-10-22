//accept file path using string format

import java.util.*;
import java.io.*;

public class FileWriterApp
{
  public static void main(String x[])throws Exception
  {
    FileWriter f=new FileWriter("C:\Users\hp\Desktop\core java practice\IO stream File handling\\first.txt");
    String dd="Arya";
    f.write(dd);
    f.close();

    System.out.println("File save success....");
    
    
  } 	

}