// take number 
// of array code
int left=0;
int right=a.length-1;
while(left<right){
    int temp=a.[left];
    a.[left]=a.[right];
    a.[right]=temp;
    left++;
    right--;
}
// ther is display
// the code of revrese 
// array