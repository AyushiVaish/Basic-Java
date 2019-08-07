class MethodOverloading
{
int a;
void display()
{
a=10;
System.out.println(a);
}
void display(int a,int b)
{
int c=a+b;
System.out.println(c);
}

void display(String a,String b)
{
String c=a+b;
System.out.println(c);
}
void display(int c,int d,int f)
{

int e= c+d+f;
System.out.println(e);

}
public static void main(String[] args)
{
MethodOverloading obj=new MethodOverloading();
obj.display();
obj.display(10,20);
obj.display("Ayushi","Aman");
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int num3=Integer.parseInt(args[2]);
obj.display(num1,num2,num3);
}

}