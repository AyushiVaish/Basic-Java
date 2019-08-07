class SS
{
int a,b;
SS()
{
a=10;
b=12;
int c=a+b;
System.out.println(c);

}
SS(int a,int b)
{
int c= a-b;
System.out.println(c);

}

}
class SS1 extends SS
{
int d;
SS1()
{
d=23;
System.out.println(d);

}
SS1(int a,int b)
{
int c= a-b;
System.out.println(c);

}

}
class ConstructorInheritance
{
public static void main(String[] args)
{

SS1 obj =new SS1();
SS1 obj1=new SS1(1,2);
}

}