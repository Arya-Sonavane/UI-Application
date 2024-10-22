class Exam
{
  private int id;
  private String name;
  private Question[] questions;

  public void setId(int id)
  {
     id=id;
  }
  public int getId()
  {
    return id;
  }
 public void setName(String name)
 {
  name=name; 
 }
 public String getName()
 {
  return name; 
 }
 void setQuestions(Question...q)
 {
   questions=q;
 }
 Question[] getQuestions()
 {
   return questions;
 }
}