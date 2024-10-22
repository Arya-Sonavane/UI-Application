import java.util.*;
class parkingLots
{
  int lots[][];
  int nCount=0;
  parkingLots(int parkingLots[][])
  {
    lots = parkingLots;
  }
  void showAllocatedParking()
  {
    for(int i=0; i<lots.length; i++)
    {
      for(int j=0; j<lots[i].length; j++)
      {
        System.out.print("\t"+(lots[i][j]));
      }
     System.out.println();
    }
    
  }


void isEmpty()
{
  for(int i=0; i<lots.length; i++)
  {
     int count=0;
     for(int j=0; j<lots[i].length; j++)
     {
     if(lots[i][j]==1)
     {
        ++count;
        ++nCount;
     }
  }
  if(count==4)
  {
    System.out.println((i+1)+ "Parking is full"+count);
  }
 else
  {
    System.out.println((i+1)+ "Remaining parking is" +(4-count));
  }
 }
}
int getTotalNumbersOfParkingLots(){
return nCount;
 }

}

public class DemoConstructorClass
{
  public static void main(String x[])
  {
    int lots[][]= new int[5][4];
    Scanner xyz=new Scanner(System.in);
    for(int i=0; i<lots.length; i++)
    {
      System.out.println("Enter" +(lots[i].length));
      for(int j=0; j<lots[i].length; j++)
      {
        lots[i][j]=xyz.nextInt();
      }   
    }
     parkingLots pkLots= new parkingLots(lots);
     pkLots.showAllocatedParking();
     pkLots.isEmpty();
     int pCount=pkLots.getTotalNumbersOfParkingLots();
     System.out.println("get total numbers of parking lots is "+pCount);

  }



}