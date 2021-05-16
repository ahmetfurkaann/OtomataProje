
package otomataproje;

import java.util.Stack;

public class Regex {
 

    private String ayristilan = "";
    private Stack operatorStack;        
    private Stack operandStack;         

 
    public Regex(String girdi) {
	ayristilan = "";
	operatorStack = new Stack();
	operandStack = new Stack();
	parcala(girdi);            
    }
    
    public void reset(){
	operandStack.clear();
	operatorStack.clear();
    }
 
    public String getAyristilan() {
	return ayristilan;
    }
 
    public void setAyristilan(String girdi) {
        parcala(girdi);       
    }    
    
    
	private void parcala(String girdi) { //PARSE İŞLEMİ
		char[] regexChar = girdi.replaceAll(" ", "").toCharArray();       // boşlukları siliyoruz ve orada yazan tüm elemanları regexChar aldı bir dizinin içine atıyoruz. (CHAR tipinde)
		for (int i = 0; i < regexChar.length; i++) {       // tüm elemanlari tek tek geziyoruz.
			if (i == 0){
                            ayristilan += regexChar[i];     // dizinin ilk elemanını stringe ekledik. bu adım tek bir kez koşulur. geri kalan elemanlar belirli koşullardan geçirilerek eklenir.
                        }				
			else {  //ilk eleman değilse
				if (regexChar[i] == '|' || regexChar[i] == '*' || regexChar[i] == ')') { // gezdiği eleman | * veya ) ise  
					ayristilan += regexChar[i]; //onları da stringe ekliyoruz
				} else {    // eğer gezilen elemanlar | * veya ) lerden biri değilse
					if (regexChar[i - 1] == '(' || regexChar[i - 1] == '|')   // gezilen bir önceki eleman ( veya | ise
						ayristilan += regexChar[i]; // bunu da stringe ekle
                                        else{
                                           ayristilan += ("&" + regexChar[i]);  // eğer onlardan hiçbiri değilse yani ab gibi bir veri girildiyse onun önüne & sembolünü koyarak stringe ekle.
                                        }				
				}
			}
		}                        
	}    
    
}
 
 
    

