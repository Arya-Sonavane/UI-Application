class Sem
{
   private int[] sub=new int[6];
   

   public void setSub(int[] sub)
   {
      if(sub.length==6)
      {
        this.sub=sub;
      }
      else
      {
        System.out.println("marks of 6 subjects");
      }
   }
     public int[] getSub()
     {
       return sub;
   }

}