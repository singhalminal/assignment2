class palindrome
{
public static void main(String[] args)
{
int rev=0,b,m;
int n=Integer.parseInt(args[0]);

m=n;
while(n!=0)
{
b=n%10;
rev=rev*10+b;
n=n/10;
}
if(m==rev)
{
System.out.println(m +" is a Palindrome");
}
else
{
System.out.println(m +" is not a Palindrome");
}
}

}