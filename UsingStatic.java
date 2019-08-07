class UsingStatic
{
static int a;
int b;
static void display(int w,int b)
{
a=w;
int c= a+b;
System.out.println(c);

}
void display2()
{
b=20;
int c=10;
a=30;
int result=a+b+c;
System.out.print(result);

}
public static void main(String[] args)
{
UsingStatic obj=new UsingStatic(); 
display(2,3);
obj.display2();
}


}