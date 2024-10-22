//create file using file class

import java.io.*;
public class CreateFile
{
  public static void main(String x[]) throws IOException
  {
    File f=new File("C:\\Users\\hp\\Desktop\\core java practice\\Array\\xyz.txt");
    boolean b =f.createNewFile();

    if(b)
    {
      System.out.println("file is created successfully....");
    }
    else
    {
      System.out.println("some problem is there");
    }   

  }
}