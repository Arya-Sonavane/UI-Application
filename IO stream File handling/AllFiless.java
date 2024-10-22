//access all files and folders from specified path


import java.io.*;
public class AllFiless
{
  public static void main(String x[])
  {
    File f=new File("C:\\Users\\hp\\Desktop\\Java practice examples");
    File list[]=f.listFiles();

    System.out.println("display all files and folders");
    for(int i=0; i<list.length; i++)
    {
       
       System.out.println(list[i]);
       
    }
  }
}