class Result
{
  private Student student;
  private Year[] years=new Year[4];

  public void setYear(Student s, Year...y)
 {
    student=s;
    if(y.length==2)
    {
      years=y;
    }
 }

}

public void generateMarksheet()
{
  System.out.println("Marksheet:"+student.getName());
  int totalMarks=0;
  int totalSubjects=0;

  
  

}






