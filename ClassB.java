public class ClassB extends ClassA
{
  int d =10;
  int e = 20;


  void Subtraction()
  {
    int f = e-d;
    System.out.println("The Subtraction is " + f);
  }
  
  @Override
  void mymethod2()
  {
   System.out.println("The Addition Class is Completed and also accessing in Class B");
  }
}