public class ShortCircuitTestAnd
{
public static void main(String[] args)
{
if(falseMethod() && trueMethod())
  System.out.println("Boht are true");
else
  System.out.println("Both are not true");
}
public static boolean trueMethod()
{
  System.out.println("Within trueMethod()");
  return true;
}
public static boolean falseMethod()
{
  System.out.println("Within falseMethod()");
  return false;
}
}
