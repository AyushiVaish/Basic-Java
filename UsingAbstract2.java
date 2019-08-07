abstract class A
{
abstract void M1();
abstract void M2(int a,int b);
A()
{
System.out.println("Hey");
}
A(int a,int b)
{
int c= a+b;
System.out.println(c);
}
A(int a)
{
System.out.println(a);
}
}
class B extends A
{
B()
{

super(2,4);
}

void M1()
{
System.out.println("A");
}
void M2(int a,int b){
int c=a-b;
System.out.println(c);
}

}
class UsingAbstract2
{
public static void main(String[] args)
{
B obj = new B();

obj.M1();
obj.M2(3,2);
}
}
