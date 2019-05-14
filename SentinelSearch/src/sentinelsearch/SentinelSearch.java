/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinelsearch;
import java.util.Random;
/**
 *
 * @author mikeross
 */
public class SentinelSearch{
public static int search(int a[], int t){
  int i;
  int p=0;
  int n=a.length;  // n = 7
  int hold;
  hold=a[n-1];  // hold = a[6] = 9; a[6] - is the last element.
  a[n-1]=t;  // a[6] = -1;
  for ( i=0;;i++)
    if (a[i]==t)  break;  // it will break, when i = 6, cause a[6] = -1;
  // after this root finished, i = 6.
  a[n-1]=t;  // a[6] = -1; again ^^
  if (i==n){  // i!=n, 6!=7.
    p= -1;
  } else{  // this branch will work.
    p= i;  // p = 6;
  }
  return p;  // return 6;
}

public static  void main(String[]args){
int t=-1;
int a[]=new int[(int)(6*Math.random())];
 for (int i=0; i<a.length; i++){

    System.out.println(search(a,t));}
    }
}