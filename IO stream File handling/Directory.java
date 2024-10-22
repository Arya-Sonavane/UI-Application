//access all directory from computer

import java.io.*;
public class Directory
{
   public static void main(String x[])
   {
     File f=new File("C:\\Users\\hp\\Desktop\\Java practice examples");
     File list[] =f.listFiles();

     System.out.println("Display folders");
     for(int i=0; i<list.length;i++)
     {
       if(list[i].isDirectory())//using this method we can access all the directories
       {
         System.out.println(list[i]);
       }
     }  
   }
}