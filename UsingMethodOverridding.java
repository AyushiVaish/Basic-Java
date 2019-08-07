class A
{
void M1()
{
System.out.println("hey");
}
void M2()
{
System.out.println("bye");
}
}
class B extends A
{
void M1()
{
System.out.println("hello");
}
void M2()
{
System.out.println("world");
}
}
class UsingMethodOverridding
{
public static void main(String[] args)
{
A obj = new B();
obj.M1();
obj.M2();
}
}