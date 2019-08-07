interface A
{
void M1();
 abstract void M2();

}
class B implements A
{
public void M1()
{
System.out.println("hello");
}
public void M2()
{
System.out.println("world");
}
}
class UsingInterface
{
public static void main(String[] args)
{
B obj = new B();
obj.M1();
obj.M2();
}
}