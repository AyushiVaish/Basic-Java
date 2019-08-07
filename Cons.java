class Cons{
int a,b;
Cons()
{
a=10;
b=12;
System.out.println(a);
System.out.println(b);

}
Cons(int a, int b)
{
this.a=a;
this.b=b;
System.out.println(a);
System.out.println(b);

}
public static void main(String[] args)
{
Cons obj= new Cons();
Cons obj2=new Cons(20,15);

}




}