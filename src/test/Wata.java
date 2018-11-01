
import java.util.*;
class Wata {
    public int solution(int N) {
        // write your code in Java SE 8
          int result=0;
                 int temp=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        int index=0;
     
     while(true){
        list.add(N%2);   
          if(N==1){
           break;
            }
       N=N/2;
     
     }
     
     for(int i=0;i<list.size();i++){
         if(list.get(i)==1){
            index++; 
         }
     }
     if(index>1){
         
       
         for(int i=0;i<list.size()-1;i++){
             if(list.get(i)==1){
             for(int j=i+1;list.get(j)==0;j++){
                     if(list.get(j)==0){
                         temp++;
                     }else{
                         if(temp>result){
                             result = temp;
                             temp=0;
                         }
                       continue;
                         
                         
                     }
             }
             
         }
         
         }
         return result;
         
     }else{
         return 0;
     }
     
     
}
}
