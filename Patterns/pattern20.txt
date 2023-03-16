import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n;i++){
		    for(int j=1; j<=n;j++){
		        if(j==1 || j==n){
		            System.out.print("*\t");
		        }
		        else if((i==j || i+j==n+1) && i>n/2){
		            System.out.print("*\t");
		        }
		        else{
		            System.out.print("\t");
		        }
		    }
		    System.out.println();
		}
	}
}
