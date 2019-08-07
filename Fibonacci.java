class Fibonacci{

public static void main(String[] args)
{
int a=0;
int b=1;
int num=Integer.parseInt(args[0]);
if(num==1)
{
 System.out.println(a);}
else if(num==2)
{
 System.out.println(a);
 System.out.println(b);
}
else{
 System.out.println(a);
 System.out.println(b);

int c=a+b;
System.out.println(c);
for(int i=1;i<num-2;i++)
{
a=b;
b=c;
c=a+b;
System.out.println(c);

}
}

}

}