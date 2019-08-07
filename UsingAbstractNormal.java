abstract class A{
A()
{
System.out.println("Hello");

}
abstract void M1();

void M2()
{
System.out.println("World");
}
}
class B extends A{
void M1()
{
System.out.println("Bye");
}
}
class UsingAbstractNormal
{
public static void main(String[] args)
{
B obj=new B();
obj.M1();
obj.M2();

}
}