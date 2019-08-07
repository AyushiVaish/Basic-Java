class A
{
void M1()
{
System.out.println("world");
}
 static void M3()
{
System.out.println("worl");
}
final void M4()
{
System.out.println("wold");
}
}
interface I1
{
void M2();

}
class UsingMultipleInheritance extends A implements I1
{
public void M2()
{
System.out.println("Hey");
}
public static void main(String[] args)
{
UsingMultipleInheritance obj = new UsingMultipleInheritance();
obj.M1();
obj.M2();
obj.M3();
obj.M4();


}

}

