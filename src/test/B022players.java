package test;

import java.util.Arrays;
import java.util.Scanner;

public class B022players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // í»ÝÂªÎÔðëòªÊåëåÞªÇ
        // Let's «Á«ã«ì«ó«¸£¡£¡

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] a=line.split(" ");
        int m= Integer.valueOf(a[0]);
          int n= Integer.valueOf(a[1]);
            int k= Integer.valueOf(a[2]);
            
            int[] p=new int[m];
            
        
            
        for(int i=0;i<k;i++){
            int num=sc.nextInt();
            if(num>0&&num<=m){
         for(int j=0;j<p.length;j++){
             if(num-1==j){
                 if(n>0){
                     n--;
                     p[j]++;
                 }
                 
             }else{
                 if(p[j]>0){
                     p[j]--;
                     p[num-1]++;
                 }
             }
         }
            }
        }
        
        int max=Arrays.stream(p).max().getAsInt();
        for(int i=0;i<p.length;i++){
            if(max==p[i]){
                System.out.println(i+1);
            }
        }
        
	}

}
