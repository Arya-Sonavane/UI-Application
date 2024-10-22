//access files from specified path
 
import java.io.*;
public class AllFiles
{
  public static void main(String x[])
  {
    File f=new File("C:\\Users\\hp\\Desktop\\Java practice examples");
    File list[]=f.listFiles();

    System.out.println("display all files and folders");
    for(int i=0; i<list.length; i++)
    {
       if(list[i].isFile())
       { 
       System.out.println(list[i]);
       }
    }
  }

}