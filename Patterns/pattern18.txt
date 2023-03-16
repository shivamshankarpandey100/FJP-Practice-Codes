import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int nst=n;
		int nsp=0;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=nsp;j++){
		     System.out.print("\t");   
		    }
		    
		    for(int j=1;j<=nst;j++){
		        if(i>1 && i<=n/2){
		            if(j==1 || j==nst){
		                System.out.print("*\t");
		            }
		            else{
		                System.out.print("\t");
		            }
		        
		    }
		    else{
		        System.out.print("*\t");
		    }
		    
		    }
		    
		    if(i<=n/2){
		        nst-=2;
		        nsp++;
		    }
		    else{
		        nst+=2;
		        nsp--;
		    }
		    System.out.println();
		}
	}
}
