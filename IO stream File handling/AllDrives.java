//get total space and free space of drive

import java.io.*;
public class AllDrives
{
  public static void main(String x[])
  {
    File f[]=File.listRoots();//listRoots() static method return array
    for(int i=0; i<f.length; i++)
    {
      long totalSpace=f[i].getTotalSpace();//method that return total space of drive
      long freeSpace=f[i].getFreeSpace();//method that return free space of drive

      System.out.println(f[i]+"\t"+(totalSpace/1073741824)+"GB\t"+(freeSpace/1073741824)+"GB");
    }
  }
}