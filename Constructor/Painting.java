import java.util.*;
class painting
{ 
  public static void main(String x[]);
  {
    int noOfInteriorWalls,noOfExteriorWalls,i=0;
    float interiorCost=18, exteriorCost=12, cost=0, temp;
    Scanner xyz=new scanner(System.in);
    noOfInteriorWalls=xyz.nextInt();
    noOfExteriorWalls=xyz.nextInt();

    if(noOfInteriorWalls<0 || noOfExteriorWalls<0)
    {
      System.out.println(" it is not valid input");
    }
    else if(noOfInteriorWalls==0 && noOfExteriorWalls==0)
    {
      System.out.println("total cost is");
    }
   else
    {
      for(i=0; i<noOfInteriorWalls; i++)
      {
        temp=xyz.nextFloat();
        cost += interiorCost*temp;
      }
      for(i=0; i<exteriorCost; i++)
      {
        temp=xyz.nextFloat();
        cost += interiorCost*temp;
      }
   System.out.printf("Total estimated cost is:%1f",cost);
    }
  }
}