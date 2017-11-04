#include<stdio.h>
int main()
{
    long int t,i,n,x,y;
    scanf("%d\n",&t);
    int arr[t];
    for(i=0;i<t;i++)
    {
        scanf("%d",&n);
        x=(n/5)+(n/25)+(n/125)+(n/625)+(n/3125)+(n/15625)+(n/78125)+(n/390625)+(n/1953125)+(n/9765625)+(n/48828125)+(n/244140625);
        arr[i]=x;
    }
    for(i=0;i<t;i++)
    {
        printf("%d\n",arr[i]);
    }
}