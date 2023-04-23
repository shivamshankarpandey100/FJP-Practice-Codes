import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int data=sc.nextInt();
    int left=0;
    int right=arr.lengtimport java.io.*;

import java.util.*;

 
public class Main
{
  
 
public static void main (String[]args) throws Exception
  {
    
      // write your code here
    Scanner sc = new Scanner (System.in);
    
int n = sc.nextInt ();
     
int arr[] = new int[n];
     
for (int i = 0; i < arr.length; i++)
      {
	
arr[i] = sc.nextInt ();
      
} 
int data = sc.nextInt ();
    
int left = 0;
    
int right = arr.length - 1;
    
int ceil = -1;//just greater of finding data
    
int floor = -1;//just smaller of finding data 
    
while (left <= right)
      {
	
int mid = (left + right) / 2;
	
 
if (data > arr[mid])
	  {
	    
left = mid + 1;
	    
floor = arr[mid];
	  
}
	
	else if (data < arr[mid])
	  {
	    
right = mid - 1;
	    
ceil = arr[mid];
	  
}
	
	else
	  {
	    
ceil = arr[mid];
	    
floor = arr[mid];
	    
break;
	  
}
      
}
    
System.out.println (ceil);
    
System.out.println (floor);
  
 
}

 
}
h-1;
    int ceil=-1;
    int floor=-1;
    while(left<=right){
        int mid=(left+right)/2;

        if(data>arr[mid]){
            left=mid+1;
            floor=arr[mid];
        }
        else if(data<arr[mid]){
            right=mid-1;
            ceil=arr[mid];
        }
        else{
            ceil=arr[mid];
            floor=arr[mid]; 
            break;
        }
        }
    System.out.println(ceil);
    System.out.println(floor);

  }

}