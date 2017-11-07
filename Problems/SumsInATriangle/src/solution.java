import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
 
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T,i,sum=0,n,j,k;
        T  = Integer.parseInt(br.readLine().trim());
        int a[][];
        String arr[];
        for(i=0;i<T;i++)
        {
            n   = Integer.parseInt(br.readLine().trim());
            a = new int[n][n];
            k=0;
            for(j=0;j<n;j++)
            {
                arr = br.readLine().trim().split(" ");
                for(k=0;k<j+1;k++)
                {
                    a[j][k] = Integer.parseInt(arr[k]);
                }
            }
            for(j=n-2;j>=0;j--)
            {
                for(k=0;k<j+1;k++)
                {
                    a[j][k]=a[j][k]+Math.max(a[j+1][k],a[j+1][k+1]);
                    
                }
                
            }
            System.out.println(a[0][0]);
        }
    }
}  