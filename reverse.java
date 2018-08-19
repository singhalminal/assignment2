class reverse
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int rev=0,b=0;
while(n>0)
{
b=n%10;
rev=b+rev*10;
n=n/10;
}
System.out.println("Reverse of a number is:"+rev);
}
}
