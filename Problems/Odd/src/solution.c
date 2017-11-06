#include<stdio.h>
#include<math.h>
int main(void)
{
	long long int t,n,i,inp,j;
	scanf("%lld",&t);
	while(t--)
	{
	scanf("%lld",&inp);
	for(i=0;i<=1000000;i++)
	{
		if((pow(2,i))>inp)
		{
			
		j=pow(2,i-1);
		printf("%lld\n",j);
		break;
		}
	}	
	}
	return 0;
}  