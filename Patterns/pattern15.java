import java.util.*;
	public class Main{
		public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
			int n=sc.nextInt();
			int nst=1;
			int nsp=n/2;
			int val=1;
			for(int i=1;i<=n;i++){
			    
			    
			    for(int j=1;j<=nsp;j++){
			        System.out.print("\t");
			    }
			    int ival=val;
			    for(int j=1;j<=nst;j++){
			        System.out.print(ival+"\t");
			        if(j<=nst/2){
			            ival++;
			        }
			        else{
			            ival--;
			        }
			    }
			    
			    if(i<=n/2){
			        val++;
			    }
			    else{
			        val--;
			    }
			    System.out.println();
			    
			    
			    
			    if(i<=n/2){
			    nsp--;
			    nst+=2;
			}
			else{
			    nsp++;
			    nst-=2;
			}
			}
			
		}
	}