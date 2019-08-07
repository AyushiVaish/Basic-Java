class A {



void add(int a,int b)
{
int c= a+b;
System.out.println(c);
}
void sub(int a, int b)
{
int c= a-b;
System.out.println(c);
}
void mul(int a,int b)
{
int c= a*b;
System.out.println(c);

}
}
class UsingInheitance extends A{

void div(int a,int b)
{
int c= a-b;
System.out.println(c);
}
public static void main(String args[])
{
int num1=Integer.parseInt(args[0]);
int num2 =Integer.parseInt(args[1]);
B obj = new B();
obj.add(num1,num2);
obj.sub(num1,num2);
obj.div(num1,num2);
}
}
