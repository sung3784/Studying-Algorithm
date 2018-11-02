package test;

import java.util.HashMap;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // í»ÝÂªÎÔðëòªÊåëåÞªÇ
        // Let's «Á«ã«ì«ó«¸£¡£¡
		HashMap<String,Integer> map=new HashMap<>();
		
        Scanner sc = new Scanner(System.in);
        int B=1;
        int W=2;
        int[][] box=new int[8][8];
        box[4][3]=B;
        box[3][4]=B;
        box[3][3]=W;
        box[4][4]=W;
        String line = sc.nextLine();
        line = line.replaceAll(" ", "");

        for(int i=0;i<Integer.valueOf(line);i++){
        	
            String line2 = sc.nextLine();
            String[] a=line2.split(" ");
            
            int x=Integer.valueOf(a[1]);
            int y=Integer.valueOf(a[2]);
            
            if(a[0].equals("B")){
                box[x-1][y-1]=B;
                
                reverse(box,x-1,y-1,B);
            }
            else if(a[0].equals("W")){
                box[x-1][y-1]=W;
               reverse(box,x-1,y-1,W);
            }
 
        }
        
        array(box,B,W);
    }
    
    public static void array(int[][] box,int B,int W){
        int bcount=0;
        int wcount=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(box[i][j]==B){
                    bcount++;
                }else if(box[i][j]==W){
                    wcount++;
                }
            }
        }
        String bre=null;
        String wre=null;
        
        if(bcount<10){
            bre="0"+bcount;
        }else{
            bre=""+bcount;
        }
        
        if(wcount<10){
            wre="0"+wcount;
        }else{
            wre=""+wcount;
        }
        
        if(bcount>wcount){
            System.out.println(bre+"-"+wre+" "+"The black won!");
        }else if(bcount==wcount){
             System.out.println(bre+"-"+wre+" "+"Draw!");
        }else{
            System.out.println(bre+"-"+wre+" "+"The white won!");
        }
        
       
    }
    
    public static int[][] reverse(int[][] box,int x,int y,int player){
         if(x+1>0&&x+1<8&&y>0&&y<8&&box[x+1][y]!=player&&box[x+1][y]!=0){
        	 System.out.println(0);
        	 for(int i=0;i<8;i++) {
        		 for(int j=0;j<8;j++) {
            		 System.out.print(box[i][j]);
            		 
            	 } 
        		 System.out.println();
        	 }
        	 if(lineCheck(box,x,y,player,1,0)){
            	  System.out.println(1);
                changeBox(box,x,y,player,1,0);
            }
             
         } if(x-1>0&&x-1<8&&y>0&&y<8&&box[x-1][y]!=player&&box[x-1][y]!=0){
            if(lineCheck(box,x,y,player,-1,0)){
            	 System.out.println(2);
                changeBox(box,x,y,player,-1,0);
            }
         } if(x>0&&x<8&&y+1>0&&y+1<8&&box[x][y+1]!=player&&box[x][y+1]!=0){
              if(lineCheck(box,x,y,player,0,1)){
            	  System.out.println(3);
                changeBox(box,x,y,player,0,1);
            }
         } if(x>0&&x<8&&y-1>0&&y-1<8&&box[x][y-1]!=player&&box[x][y-1]!=0){
              if(lineCheck(box,x,y,player,0,-1)){
            	  System.out.println(4);
                changeBox(box,x,y,player,0,-1);
            }
         } if(x+1>0&&x+1<8&&y-1>0&&y-1<8&&box[x+1][y-1]!=player&&box[x+1][y-1]!=0){
              if(lineCheck(box,x,y,player,1,-1)){
            	  System.out.println(5);
                changeBox(box,x,y,player,1,-1);
            }
         } if(x+1>0&&x+1<8&&y+1>0&&y+1<8&&box[x+1][y+1]!=player&&box[x+1][y+1]!=0){
              if(lineCheck(box,x,y,player,1,1)){
            	  System.out.println(6);
                changeBox(box,x,y,player,1,1);
            }
         } if(x-1>0&&x-1<8&&y-1>0&&y-1<8&&box[x-1][y-1]!=player&&box[x-1][y-1]!=0){
              if(lineCheck(box,x,y,player,-1,-1)){
            	  System.out.println(7);
                changeBox(box,x,y,player,-1,-1);
            }
         } if(x-1>0&&x-1<8&&y+1>0&&y+1<8&&box[x-1][y+1]!=player&&box[x-1][y+1]!=0){
              if(lineCheck(box,x,y,player,-1,1)){
            	  System.out.println(8);
                changeBox(box,x,y,player,-1,1);
            }
         }
          
          
        return box;
    }
    public static int count=0;
    public static boolean lineCheck(int[][] box,int x, int y,int player,int changeX,int changeY){
      if(x+changeX>=0&&x+changeX<=7&&y+changeY>=0&&y+changeY<=7){
        if( lineCheck(box,x+changeX,y+changeY,player,changeX,changeY)){
            /* if(){
                 count++;
                 return true; 
             }else{
                 return false;
             }*/
             return false;
            
        }else if(count>=1&&box[x+changeX][y+changeY]==player){
            count=0;
            return true;
        }else{
            count=0;
            return false;
        }
       }else{
           return false;
       }
    
    }
    
    public static int[][] changeBox(int[][] box,int x,int y,int player,int changeX,int changeY){
         if(box[x+changeX][y+changeY]==player){
            return box; 
         }else{
              System.out.println("here?");
            box[x+changeX][y+changeY]=player;
           changeBox(box,x+changeX,y+changeY,player,changeX,changeY);
           return null;
         }
         
       
      
    } 
    
}