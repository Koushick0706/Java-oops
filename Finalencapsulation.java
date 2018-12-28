public class Finalencapsulation
{
 public static void main(String[] args)
{
  Encapsulation obj = new Encapsulation();
  obj.setCourse("Selenium");
  obj.setTution("Qspiders");

  System.out.println("The Course name is " + obj.Getcourse());
  System.out.println("The Tution name is " + obj.GetTution());
}
}