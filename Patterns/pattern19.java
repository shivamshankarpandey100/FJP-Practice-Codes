/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n;i++){
		        if(i==1){
		            //are you first row
		            for(int j=1; j<=n;j++){
		               if(j<=n/2 + 1 || j==n){
		                System.out.print("*\t");
		            }
		            else{
		                System.out.print("\t");
		            } 
		            }
		            
		        }
		        else if(i<=n/2){
		            //What are you < n/2 row
		            for(int j=1; j<=n;j++){
		                
		            if(j==n/2 + 1 || j==n){
		                System.out.print("*\t");
		            }
		            else{
		               System.out.print("\t"); 
		            }
		            
		            }
		        }
		        else if(i== n/2 + 1){ 
		            //what are you n/2+1 row
		            for(int j=1; j<=n;j++){
		            System.out.print("*\t");
		            }
		        }
		        
		        else if(i<n){
		            //what are you <n row
		            for(int j=1; j<=n;j++){
		            if(j==1 || j==n/2 + 1){
		                System.out.print("*\t");
		            }
		            else{
		                System.out.print("\t");
		            } 
		            
		            }
		        }
		        else{
		            // or are you last row 
		            for(int j=1; j<=n;j++){
		            if(j>=n/2 + 1 || j==1){
		                System.out.print("*\t");
		            }
		            else{
		                System.out.print("\t");
		            }
		            
		            }
		        }
		    
		    System.out.println();
		}
	}
}
