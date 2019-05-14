public class Search{

public static int search(int a[], int t) {
int i;
int p=0;
 int n=a.length;
int hold;
 hold=a[n-1];
 a[n-1]=t;
  for ( i=0;;i++)
  if (a[i]==t)  break;
    a[n-1]=t;
  if (i==n){
 p= -1;
} else{
   p= i;
}
return p;
}

public static  void main(String[]args){
int t=-1;
int a[]=new int[]{4,5,2,6,8,7,9};
 System.out.println(search(a,t));  
}
}