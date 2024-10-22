class DBTest
{  private static DBTest db; //declare reference using private and static 
   private DBTest()
   { System.out.println("I am single tone class");
   }
   public static DBTest getInstance()
   {         if(db==null)
	{ db = new DBTest();
	}
	return db;
   }
}
public class singlton
{
   public static void main(String arg[])
   {
   DBtest db=new DBTest();
   }
}
