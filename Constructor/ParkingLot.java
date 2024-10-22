class ParkingLot
{
  private int rows;
  private int columns;
  private int[][] parlingLot;

  ParkingLot(int rows, int columns)
  {
     this.rows=rows;
     this.cols=cols;
     this.parkingLot = new int[rows][columns]; 
  }
   boolean isEmpty(int row, int col)
   {
     return parkingLot[row][col]==0; 
   }
  
    boolean allocateParking(int row, int col) // 1 2
    {
     if(parkingLot[row][col]==1)
     {
       return false;
     } 
      ELSE{
     parkingLot[row][col]=1;
    return true;

   }
   System.out.println("Allocated parking slots");
   for(int i=0)

     
   
    }

   }
 }
}
 /*

   1 0 0
   0 1 1
   1 1 1 
   */
 