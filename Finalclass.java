public class Finalclass extends Superclass
{
 void mymethod5()
 {
  System.out.println("The Superclass Got Executed and get accessed in the Final Class ");
 }
 public static void main(String[] args)
 {
  Superclass obj = new Finalclass();
  obj.mymethod1();
  obj.mymethod2();
  obj.mymethod3();
  obj.Superclass();
  obj.mymethod4();
  obj.mymethod5();

  Superclass obj1 = new Superclass();
  obj1.mymethod5();

  Baseclass obj2 = new Baseclass();
  obj2.mymethod3();
 }
}