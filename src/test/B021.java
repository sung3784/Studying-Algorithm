import java.util.*;


public class B021 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
/*・末尾が s, sh, ch, o, x のいずれかである英単語の末尾に es を付ける
・末尾が f, fe のいずれかである英単語の末尾の f, fe を除き、末尾に ves を付ける
・末尾の1文字が y で、末尾から2文字目が a, i, u, e, o のいずれでもない英単語の末尾の y を除き、末尾に ies を付ける
・上のいずれの条件にも当てはまらない英単語の末尾には s を付ける*/

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count=Integer.valueOf(line);
         
        for(int i=0;i<count;i++){
            String abc = sc.nextLine();
          
           int length = abc.length();
        
           String a= abc.substring(length-2,length);
           String b= abc.substring(length-1,length);
           String c= abc.substring(length-2,length-1);
           
           if(a.equals("sh")||a.equals("ch")||b.equals("s")||b.equals("o")||b.equals("x")){
                  System.out.println(abc+"es");
               
           }else if(a.equals("fe")||b.equals("f")){
                if(a.equals("fe")){
                   
                      System.out.println( abc.substring(0,length-2)+"ves");
                }else if(b.equals("f")){
                    
                     System.out.println( abc.substring(0,length-1)+"ves");
                }
               
               
           }else if(b.equals("y")){
               //nothing
               if(c.equals("a")||c.equals("i")||c.equals("u")||c.equals("e")||c.equals("o")){
                    System.out.println( abc+"s");
                  //code here 
               }else{
                    System.out.println( abc.substring(0,length-1)+"ies");
                   
               }
               
           }
           // +s
           else{
               
                 System.out.println( abc+"s");
               
           }
        
           
           
            
        }
        
    
       
    }
}