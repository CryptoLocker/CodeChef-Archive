#include<stdio.h>
int main()
{
    int N,i,x1,x2,x3,y1,y2,y3,a,b,c,d,e,f;
    int amax=0;
    int amin,x,y;
    int arr[100];
    scanf("%d",&N);
    for(i=0;i<N;i++)
    {
        scanf("%d %d %d %d %d %d",&x1,&y1,&x2,&y2,&x3,&y3);
        a=x1-x3;
        b=y2-y1;
        c=a*b;
        d=x1-x2;
        e=y3-y1;
        f=d*e;
        arr[i]=c-f;
        arr[i]=arr[i]/2;
        if(arr[i]<0)
        {
            arr[i]=arr[i]*(-1);
 
        }
        if(i==0)
        {
            amin=arr[0];
            x=0;
        }
        if(i>0&&arr[i]<=amin)
        {
            amin=arr[i];
            x=i;
        }
        if(arr[i]>=amax)
        {
            amax=arr[i];
            y=i;
        }
 
 
    }
    x=x+1;
    y=y+1;
    printf("%d %d",x,y);
    return 0;
 
} 