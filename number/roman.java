package number;
public class roman
{
public int romanToInteger(String s)
{
int res=0;
char[] arr = new char[]{'M','D','C','L','X','V','I'};
int[] val = new int[]{1000,500,100,50,10,5,1};
for(int i=0;i<s.length();i++)
{
for(int j=0;j<7;j++)
{
if(s.charAt(i)==arr[j])
{
res=res+val[j];
break;
}
}
}
return (res);
}
}

