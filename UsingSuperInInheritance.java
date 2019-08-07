class S
{
S()
{
System.out.println("Hello");
}
int a= 10;
void S1()
{
System.out.println("World");
}


}
class S1 extends S
{
int num=1;
S1()
{
super();
System.out.println("Hey");
}

void S2()
{
super.S1();
System.out.println(super.a);
System.out.println("Kemm Chooo");

}


}
class UsingSuperInInheritance
{
public static void main(String[] args)
{
S1 obj=new S1();
System.out.println(obj.num);

obj.S2();


}
}
