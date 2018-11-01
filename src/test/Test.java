package test;

import java.util.Scanner;

public class Test {

	 public static void main(String[] args) {
	        // í»ÝÂªÎÔðëòªÊåëåÞªÇ
	        // Let's «Á«ã«ì«ó«¸£¡£¡
	    String eq="'\\\\\\'";
	        Scanner sc = new Scanner(System.in);
	        int h = sc.nextInt();
	         int w = sc.nextInt();
	        char [][] box=new char[h][w];
	            sc.nextLine();
	        for(int i=0;i<h;i++){
	            String line = sc.nextLine();
	            for(int j=0;j<w;j++){
	                 box[i][j]=line.charAt(j);
	            }
	           
	        }
	        int count=0;
	        int a=0;
	        int b=0;
	        int tempA=0;
	        int tempB=0;
	        while(true){
	              if(a>h-1||b>w-1||a<0||b<0){
	                break;
	            }else{
	            
	            if(box[a][b]=='_'){
	                if((a==0&&b==0)||(tempA==a&&b>tempB)){
	                    tempA=a; tempB=b; 
	                    b++;
	                }else if(tempA==a&&b<tempB){
	                     tempA=a; tempB=b;
	                     b--;
	                }else if(tempB==b&&tempA>a){
	                    tempA=a; tempB=b;
	                    a--;
	                }else if(tempB==b&&a>tempA){
	                    tempA=a; tempB=b;
	                    a++;
	                }
	            }
	          
	           
	            else if(box[a][b]==eq.charAt(2)){
	                 if((a==0&&b==0)||(tempA==a&&b>tempB)){
	                    tempA=a; tempB=b; 
	                    a++;
	                }else if(tempA==a&&b<tempB){
	                     tempA=a; tempB=b;
	                     a--;
	                }else if(tempB==b&&tempA>a){
	                    tempA=a; tempB=b;
	                    b--;
	                }else if(tempB==b&&a>tempA){
	                    tempA=a; tempB=b;
	                    b++;
	                }
	            }
	            
	            else if(box[a][b]=='/'){
	                 if((a==0&&b==0)||(tempA==a&&b>tempB)){
	                    tempA=a; tempB=b; 
	                    a--;
	                }else if(tempA==a&&b<tempB){
	                     tempA=a; tempB=b;
	                     a++;
	                }else if(tempB==b&&tempA>a){
	                    tempA=a; tempB=b;
	                    b++;
	                }else if(tempB==b&&a>tempA){
	                    tempA=a; tempB=b;
	                    b--;
	                }
	            }
	            }
	           
	          
	            
	            count++;
	        }
	           
	            System.out.println(count);
	            
	    }
	
	

}