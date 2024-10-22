public class ExamApplication
{
   public static void main(String x[])
   { 
     Student[] students=[s1,s2,s3];
     Student s1=new Student();
     s1.setId(1);
     s1.setName("Vrushali");
     s1.setEmail("vrushali123@gmail.com");
     s1.setContact("8888888888");
     s1.setMarks("75");
     s1.setExam("exam");

     Student s2=new Student();
     s1.setId(2);
     s1.setName("Tejaswini");
     s1.setEmail("teju123@gmail.com");
     s1.setContact("9999999999");
     s1.setMarks("75");
     s1.setExam("exam");

     Student s3=new Student();
     s1.setId(3);
     s1.setName("Vrush");
     s1.setEmail("vrush123@gmail.com");
     s1.setContact("9898999999");
     s1.setMarks("76");
     s1.setExam("exam");

    Exam exam=new Exam();
    exam.setId(1);
    exam.setName("April-May Final Exam");
    exam.setQuestions(questions);
   
    Question[] questions=[q1, q2, q3, q4];
    Question q1=new Question();
    q1.setId(1);
    q1.setQuestion("who invented java programming");
    q1.setOp1("rossum");
    q1.setOp2("James Gosling");
    q1.setOp3("Dennis ritche");
    q1.setOp4("Strousstrup");

    Question q2=new Question();
    q1.setId(2);
    q1.setQuestion("What is the extension of java files");
    q1.setOp1(".js");
    q1.setOp2(".txt");
    q1.setOp3(".class");
    q1.setOp4(".java");

    Question q3=new Question();
    q1.setId(3);
    q1.setQuestion("Which one of the following is not oops concept");
    q1.setOp1("polymorphism");
    q1.setOp2("Inheritance");
    q1.setOp3("Compilation");
    q1.setOp4("Encapsulation");

    Question q4=new Question();
    q1.setId(4);
    q1.setQuestion("which one of the following is not jva feature");
    q1.setOp1("object oriented");
    q1.setOp2("use of pointers");
    q1.setOp3("portable");
    q1.setOp4("dynamic");

    




    



   }

}