import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        int num = Integer.valueOf(line);
         int sum =0;  
        for(int i=1;i<=num;i++){
                    
            String b = sc.nextLine();
   
           String[] ch = b.split(" ");
            
        String q=ch[0];
            String w=ch[1];
           
            if(q.length() == w.length() && q.equals(w)){
                
            sum=sum+2;    
            }else if(q.length() == w.length()){
           
               int temp = 0;
                for(int k=0;k<q.length();k++){
                    
                if(q.charAt(k) != w.charAt(k)){
                
                    temp++;
                }    
                   
                   
                }
                 if(temp==1){
                           
                        sum++;
                    }else if(temp>1){
                        
                        
                    }else{
                        
                    }
            }
            
            
        }
        
        System.out.println(sum);
    }
}