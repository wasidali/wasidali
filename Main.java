package com.wasid;

public class Main {

    public static void main(String[] args) {
	int arr[]={1,2,3,2};
	int x=1,y=3;
	int idx1=0,idx2=0;
	int i=0,j=arr.length-1,minDis=0;

	  while (i<j){
	      if(arr[i]==x)
	          idx1=i;
          if(arr[j]==y)
              idx2=j;
		   minDis=idx2-idx1;
          i++;
          j--;

      }
	   
        System.out.println(minDis);
    }
}
