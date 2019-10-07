import java.util.*;


public class C34TEACHERHOMEWORK {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
       String[] ab=line.split(" "); 
     
       //totall length 5
       //1 and 3 are ops
       //0 2 4 are number
       int sum=0;
       int x = 0;
       for(int i=0;i<ab.length;i++){
        if(ab[i].equals("x")){
            x=i;
        }
           
       }
       
       if(x==4){
           if(ab[1].equals("+")){
               sum=Integer.valueOf(ab[0])+Integer.valueOf(ab[2]);
               
           }else if(ab[1].equals("-")){
                 sum=Integer.valueOf(ab[0])-Integer.valueOf(ab[2]);
           }
           
       }else if(x==2){
            if(ab[1].equals("+")){
               sum=Integer.valueOf(ab[4])-Integer.valueOf(ab[0]);
               
           }else if(ab[1].equals("-")){
               sum=Integer.valueOf(ab[4])-Integer.valueOf(ab[0]);
               sum*= -1;
           }
           
       }else{
              if(ab[1].equals("+")){
             sum=Integer.valueOf(ab[4])-Integer.valueOf(ab[2]);
               
           }else if(ab[1].equals("-")){
               sum=Integer.valueOf(ab[4])+Integer.valueOf(ab[2]);
           }
           
           
       }
       
       
       
       
       System.out.println(sum);
       
       
       
       
       
       
       
      
    }
}