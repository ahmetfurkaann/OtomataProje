package otomataproje;

import java.util.Stack;
import java.lang.Character;

public class PostFix {
    
    public static boolean KarakterveyaSayiMi(char c ){  //Burada girilen ifadenin 01 veya ab gibi bir ifade olup olmadığı kontrol edilir.   
        if(Character.isLetterOrDigit(c)){   //Character classının fonksiyonunu kullandık. isLetterorDigit: Harf veya Rakam mı?
            return true;
        }else{
            return false;
        }      
    }
    
    
    public static int Oncelik(char k){      //Sembol önceliklerini kıyaslıyoruz. Öncelik sırasında şu şekildedir: * -> & -> | -> ()
        if(k == '*'){                        //Star
            return 3;
        }else if(k == '&' || k == '?'){      //Concatenation
            return 2;
        }else if(k == '|' || k == '+'){      //Union
            return 1;
        }else if(k == '(' ||k == ')'){       //Parantez
            return 0;
        }else{
            return -1;                       //diğer her şey
        }
    }
   
    public boolean isAcceptedOperator(char c){
        if(c=='*' || c=='|' || c=='&' || c=='(' || c=='+' || c=='?' || c==')'){
            return true;
        }
            return false;
    } 
    
    public String quString ="";     //quString adında bir String oluşturduk. Buna alınan harfleri ve daha sonra sembolleri ekLEyeceğiz. Görseldekinin aynısı.
    
    public String transformInfixtoPostfix(String infix){
        
        Stack<Character> stack = new Stack<>();           
        String yoket = "";      // Parantezleri yok etmek için kullanacağımız string.
        
        for(int i=0; i<infix.length();i++){ //Girilen bir regular expresssionu karakter dizisine aktarıyoruz.         
            char anlik= infix.charAt(i);        
            if(KarakterveyaSayiMi(anlik)){      //Eğer o karakter ab veya 01 gibi bir girdiyse stringimize yazılacak. Sembol felansa yazılmayıp stack'e atılacak
                quString += infix.charAt(i); 
            }   
            
            else if(anlik == '('){
                stack.push(anlik);      //stack.push() yerine stack.addElement() kullanılabilir. !!!!!!!!!
             }
                   
            else if(anlik == ')'){      //Eğer ) geldiyse bundan önce ( gelmiş demektir. Bunları yok edeceğimizden dolayı ('dan öncekileri quStringe yazıyoruz.
                while(!stack.isEmpty() && stack.peek()!='('){   //Stack dolu olduğu sürece ve en baştaki eleman "(" olana dek
                    quString += stack.pop();        //stackten bir eleman çıkar ve quString'e ekle.
                }
                
                stack.push(anlik);      // ) işaretini stack'e aktardık.
                
                while(stack.peek()!='('){       //stackin en üstündeki eleman ( olmadığı sürece
                    yoket += stack.pop();       //stackteki en üstteki elemani çıkar ve yok et
                }                               // muhtemelen bu adım sadece 1 kere koşulacak ve onda da ) işareti yok edilecek.
                               
                if(stack.peek() == '('){        //( işareti en başa geldiyse artık alıp onu yok edebiliriz.
                    yoket += stack.pop();
                }               
            }     
                else if(isAcceptedOperator(anlik)){ //eğer semboller | & () | * ise                   
                    if(stack.isEmpty()){    //eğer stack boşsa
                        stack.push(anlik);  //stacke yerleştir
                    }else{  //eğer stack boş değil ise
                        while(!stack.isEmpty() && Oncelik(anlik) <= Oncelik(stack.peek())){ //stack dolu olduğu sürece ve o anki sembolün önceliği en üstteki elemanın önceliğinden küçük eşit ise
                            quString += stack.pop();    //stackin en üstteki elemanı çıkar ve quStringe ekle
                        }
                        stack.push(anlik);  //daha sonra da o anki elemanı diziye aktar. (veya mesela stack boş ise direkt buraya gelecek ve bu sayede de direkt stack'e ekleme yapabileceğiz.)
                    }
                    
                }    
            }
      
            while(!stack.isEmpty()){    //stack dolu olduğu sürece
                if(stack.peek()=='('){  //birden fazla parantez girildiyse veya parantez kapama işareti girilmeden parantez açma işareti girildiyse
                    return "Parantez işleminizde hata vardır.";
                    
                }
                quString += stack.pop();
            }
            
        return quString;
    }    
    
    
    
}
