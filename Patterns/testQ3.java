import java.util.*;
	public class Main{
		public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2!=0){
			int k=0;
			for(int i=1;i<=n;i++){
				int startingValue=n*k+1;
				if(i==1 || i==n){
					for(int j=1;j<=n;j++){
						System.out.print(startingValue+"\t");
						startingValue++;
					}
				}
					else{
						for(int j=1;j<=n;j++){
							if(j==1 || j==n){
								System.out.print(startingValue+"\t");
							}
							else{
								System.out.print("*\t");
								startingValue++;
							}
						}
					}
					if(i<=(n/2)){
						k=k+2;
					}
					else if(i==((n/2)+1)){
						k=k-1;
					}
					else{
						k=k-2;
					}
					 
				
				System.out.println();
			}

        }
        else{//for even
		int k=0;
		for(int i=1;i<=n;i++){
			int startingValue=n*k+1;
			if(i==1 || i==n){
				for(int j=1;j<=n;j++){
					System.out.print(startingValue+"\t");
					startingValue++;
				}
			}
			else{
				for(int j=1;j<=n;j++){
					if(j==1 || j==n){
						System.out.print(startingValue+"\t");
					}
					else{
						System.out.print("*\t");
						startingValue++;
					}
				}
				if(i<n/2){
					k=k+2;
				}
				else if(i==n/2){
					k=k+1;
				}
				else{
					k=k+2;
				}
			}
			System.out.println();
		}
        }
		}
	}