package arrayd;
import java.util.Scanner;
public class DELETE {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Ente the Array Length:");
        int n=s.nextInt();
        int[]A=new int[n];
        System.out.print("Enter the Array:");
        for(int i=0;i<n;i++) A[i]=s.nextInt();
        System.out.print("Index:");
        int index=s.nextInt();
        for(int i=0;i<n;i++){
            int a=A[i];
            int b=A[index];
            if(a==b)continue;  
            System.out.print(a+" ");
        }   
    }
}
