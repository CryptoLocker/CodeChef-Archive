import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.Arrays;
 
/**
 *
 * @author Gokul
 */
public class Main{
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t=Integer.parseInt(br.readLine().trim());
        int max=0,min=0;
        int temp1=0;
        int temp2=0;
       //int[] arr = new int[t];
        for(int i=0;i<t;i++)
        {
            String[] xy=br.readLine().trim().split(" ");
            int a=Integer.parseInt(xy[0]);
            int b=Integer.parseInt(xy[1]);
            temp1=a+temp1;
            temp2=b+temp2;
            int diff;
            diff=temp1-temp2;
            //arr[i]=diff;
            if(diff<0 && diff<min)
            {
                min=diff;
            }
            else if(diff>0 && diff>max)
            {
                max=diff;
            }
          
              
            
        }
      // Arrays.sort(arr);
       //min=arr[0];
      
      // min=min*(-1);
       
        if(max>(-min))
        {
            out.println("1 "+max);
        }
        else
        {
            out.println("2 "+(-min));
        }
        out.close();
    }
}