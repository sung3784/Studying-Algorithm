import java.util.Scanner;


public class C070 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        
        int num = Integer.valueOf(number);
        
       
        
        for(int i=0;i<num;i++){
            String card=sc.nextLine();
            int length = card.length();
            int cards = Integer.valueOf(card);
             
      
        
            int[] array = new int[length];
            
            for(int k=0;k<length;k++){
            
            array[k] = cards%10;
            cards= cards/10;
            
            }
            
            int result=0;
            int result2=0;
            for(int q=0;q<array.length-1;q++){
                int temp=0;
                for(int w=q;w<array.length;w++){
                    
                    if(w!=q&&array[q]==array[w]){
                        temp++;
                        
                    }
                    
                }
              
               if(result==1 && temp==1 && result ==temp){
                    
                    result2=1;
                }else if(temp>result){
                     result=temp;
                }
            
                
            }
            
                if(result==0){
                  System.out.println("No Pair");  
                    
                }else if(result==1&&result2==0){
                    System.out.println("One Pair");  
                    
                }else if(result==1&&result2==1){
                    System.out.println("Two Pair");  
                    
                }else if(result==2){
                     System.out.println("Three Card");  
                    
                }else if(result==3){
                    System.out.println("Four Card");  
                    
                }
            
            
        }
            
                
           
            
            
        }
        
    
    }
