import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
 
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
        int t = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[t];
        for(int i =0;i<t;i++)
        {
             arr[i] = Integer.parseInt(br.readLine().trim());
        }
        Arrays.sort(arr);
        for(int j=0;j<t;j++)
        {
            
            out.println(arr[j]);
        }
        out.close();
    }
}