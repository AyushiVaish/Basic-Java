 class A {
 int a=10;
A()
{
a=12;
System.out.println(a);
System.out.println("A");
}
 final void M1()
{
System.out.println("HEy");

}
}
class B extends A{
B()
{
System.out.println("B");
}

}
class UsingFinal
{
public static void main(String[] args)
{
B obj = new B();

obj.M1();


}
}