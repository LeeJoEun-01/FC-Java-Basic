package ch11;

public class StudentTest {
  
  public static void main(String[] args) {
    
    MyLogger mylogger = MyLogger.getLogger();

    String name = null;
    try{
      Student student = new Student(name);
    } catch(StudentNameFormatException e) {
      mylogger.warning(e.getMessage());
    } 

    try{
      Student student = new Student("Edward Jon Kim Test");
    } catch(StudentNameFormatException e) {
      mylogger.warning(e.getMessage());
    }

    try{
      Student student = new Student("James");
    } catch(StudentNameFormatException e) {
      mylogger.warning(e.getMessage());
    }

  }
}
