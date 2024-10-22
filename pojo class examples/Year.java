class Year
{
 private int id;
 private String YearName;
 private Sem[] s=new Sem[2];
 
 public void setId(int i)
 {
    id=i;
 }  
 public int getId()
 {

   return id;
 }
 public void setYearName(String y)
{
  YearName=y;
}

public String getYearName()
{
   return YearName;
}
 
public void setSems(Sem...sems)
{
   if(sems.length==2)
   {
    sems=s;  
   }
}

}