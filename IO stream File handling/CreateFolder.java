//want to create folder 

import java.io.*;
public class CreateFolder
{
  public static void main(String x[])
  {
    File f=new File("C:\\Users\\hp\\Desktop\\core java practice\\IO stream File handling\\Demo");
    boolean b1=f.exists();//this method is check folder is present on location or not

    if(b1)
    {
      System.out.println("Folder alredy exist");
    }
    else
    {
       boolean b=f.mkdir();//this method is create folder
    if(b)
    {
      System.out.println("Folder is created");
    } 
    else
   {
      System.out.println("some problem is there "); 
   }  
  }
}

}
