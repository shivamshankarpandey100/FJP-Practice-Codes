import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int one[]=new int[n1];
        for(int i=0;i<one.length;i++){
            one[i]=sc.nextInt();
        }
            int n2 = sc.nextInt();
            int two[]=new int[n2];
            for(int i=0;i<two.length;i++){
                two[i]=sc.nextInt();
            }

    int sum[]=new int[n2>n1? n2:n1];
    int i=one.length-1;
    int j=two.length-1;
    int k=sum.length-1;
    int c=0;
    while(k>=0){
        int d=c;
        if(i>=0){
            d=d+one[i];
        }
        if(j>=0){
            d=d+two[j];
        }
        c=d/10;
        d=d%10;
        sum[k]=d;

        i--;
        j--;
        k--;


    }
    if(c>0){
        System.out.println(c);
    }
    for(int x=0;x<sum.length;x++){
        System.out.println(sum[x]);
    }

  }
}
  
