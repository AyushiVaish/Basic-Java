class Armstrong {
public static void main(String[] args)
{
int num=Integer.parseInt(args[0]);
int b,arm=0,temp;
temp=num;
while(temp !=0){
b=temp%10;
arm=arm+b*b*b;
temp=temp/10;b 
}
if(num==arm){
System.out.println("It is an armstrong number " + num);
}
else
System.out.println("It is not");



}
}