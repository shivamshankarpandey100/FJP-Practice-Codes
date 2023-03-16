import java.util.*;

public class Main 
{
  
public static void main (String[]args) 
  {
    
Scanner sc = new Scanner (System.in);
    
int n = sc.nextInt ();
    
int nsp = 1;
    
int nst = (n / 2) + 1;
    
for (int i = 1; i <= n; i++)
      {
	
	  //for stars
	  for (int j = 1; j <= nst; j++)
	  {
	    
System.out.print ("*\t");
	  
} 
	  //for space
	  for (int j = 1; j <= nsp; j++)
	  {
	    
System.out.print ("\t");
	  
} 
	  //for stars
	  for (int j = 1; j <= nst; j++)
	  {
	    
System.out.print ("*\t");
	
} 
if (i <= n / 2)
	  {
	    
nsp += 2;
	    
nst--;
	  
}
	
	else
	  {
	    
nsp -= 2;
	    
nst++;
	  
}
	
System.out.println ();
      
}
  
 
 
}

}
