class Palindrome
{
public static void main(String[] args)
{
int reverse=0,temp;
int num=Integer.parseInt(args[0]);
temp=num;
while(temp !=0)
{

reverse=reverse*10;
reverse=reverse+temp%10;
temp=temp/10;
}
if(num==reverse)
{
System.out.println("The number is palindrome " + num);
}
else
System.out.println("It is not");
}
}