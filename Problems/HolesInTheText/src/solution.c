#include<stdio.h>
#include<string.h>
int main()
{
    int t,i;
    scanf("%d",&t);
    for(i=0;i<t;i++)
    {
        char word[101];
        scanf("%s",word);
        int j,k;
        int count=0;
        k=strlen(word);
        for(j=0;j<k;j++)
        {
            if(word[j]=='A' || word[j]=='D' || word[j]=='O' || word[j]=='P' || word[j]=='R' || word[j]=='Q' )
            {
                count=count+1;
            }
            else if(word[j]=='B')
            {
                count=count+2;
            }
        }
        printf("%d\n",count);
    }
    return 0;
}