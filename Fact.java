class Fact
{


int fact( int num)
{

if(num==1)
{
return 1;
}
else {
int fact= (num*fact(num-1));
return fact;

}
}

public static void main(String[] args)
{
int b=Integer.parseInt(args[0]);
Fact f=new Fact();

int a=f.fact(b);
System.out.println(a);
}

}