import static java.lang.Integer.max;
import java.lang.reflect.Array;
import java.util.Scanner;

public class arrS {
    public static int slargest( int a[]) {
        int pre=1;
        int suff=1;
        int ans;


        for (int i = 0; i < a.length; i++) {
            if (pre==0){
                pre=1;
            }
            if (suff==0){
                suff=0;
            }
            pre=pre*a[i];
            suff=suff*a[i];
            ans=max(ans, max(pre,suff));
            
       
            }
            return ans
        }
            
        }
    


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the array");
        int size= sc.nextInt();
        int a[] =new int[size];   
    }
    
