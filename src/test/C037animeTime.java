package test;

import java.util.Scanner;

public class C037animeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        String line = sc.nextLine();
	        String[] a=line.split(" ");
	       
	        String[] md=a[0].split("/");
	        String[] hm=a[1].split(":");
	        
	        int month=Integer.valueOf(md[0]);
	         int day=Integer.valueOf(md[1]);
	          int hour=Integer.valueOf(hm[0]);
	           int min=Integer.valueOf(hm[1]);
	           
	           if(min>=60){
	                 hour=hour+(min/60);
	               min=min%60;
	             
	           }
	           else if(hour>=24){
	              day=day+(hour/24);
	               hour=hour%24;
	              
	           }
	          else if(day>31){
	                month=month+(day/31);
	               day=day%31;
	             
	           }
	          else if(month>12){
	               month=month%12;
	           }
	           
	           
	        System.out.println(intChanger(month)+"/"+intChanger(day)+" "+intChanger(hour)+":"+intChanger(min));
	    }
	    
	    
	    public static String intChanger(int n){
	        if(n<10){
	            return "0"+n;
	        }else{
	            return ""+n;
	        }

	}

}
