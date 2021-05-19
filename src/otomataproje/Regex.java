
package otomataproje;

import java.util.Stack;

public class Regex {

    private String ayristilan = "";
    private Stack operatorStack;        
    private Stack operandStack;  
    private int [][] oncelik = {
		{ 1, 1, 1, -1, 1, 1 },// *&|()#         peek(), anlik
		{ -1, 1, 1, -1, 1, 1 },
                { -1, -1, 1, -1, 1, 1 },
		{ -1, -1, -1, -1, 0, 2 },
                { 1, 1, 1, 1, 1, 1 }, 
		{ -1, -1, -1, -1, -1, -1 }        
    };
    
    public int oncelikOperatoru(Character c1, Character c2){
        String oncelikString = "*&|()#";
        return this.oncelik[oncelikString.indexOf(c1.toString())][oncelikString.indexOf(c2.toString())];
    }    

    public Regex() {
	ayristilan = "";
	operatorStack = new Stack();
	operandStack = new Stack();          
    }
 
    public Regex(String girdi) {
	ayristilan = "";
	operatorStack = new Stack();
	operandStack = new Stack();
	parcala(girdi);            
    }

    public String getAyristilan() {
	return ayristilan;
    }
 
    public void setAyristilan(String girdi) {
        parcala(girdi);       
    }    
 
////////////////////////////////////////////////////////////    
    
    public static boolean KarakterveyaSayiMi(char c){       //Girilen ifadenin sayı veya alfabi mi yoksa sembol mü olduğunu kontrol ediyoruz.
        if(Character.isLetterOrDigit(c)){
            return true;
        }
        else{
            return false;       //Karakter veya sayı değilse sembol olur.
        }
    }     

////////////////////////////////////////////////////////////    

	public Graph transformNFA() {
		if (ayristilan.length() == 0)
			return null;
		else {
			int i = 0;      //while döngüsü için kullanıldı.
			operatorStack.push('#');
			char[] alfabe = (ayristilan + "#").toCharArray();   //Burada # işareti alfabe harf dizimizin en sonune eklenmektedir. Örnek: a&b -> a&b#
                        
			while (alfabe[i] != '#' || (Character) (operatorStack.peek()) != '#') {
				if (KarakterveyaSayiMi(alfabe[i])) {
                                    Graph graph0 = new Graph();
                                    graph0.alfabeNFA(alfabe[i]);
					operandStack.push(graph0);
					i++;
				} else {                                            // &=1              * = 0          -1
					int deger=oncelikOperatoru((Character)(operatorStack.peek()), alfabe[i]);
					switch (deger) {
					case 1:
						Character character=(Character)operatorStack.pop();
						switch (character) {
						case '*':
							Object obj=operandStack.pop();
							Graph graph1=new Graph();
							graph1.Star(obj);
							operandStack.push(graph1);
							break;
						case '&':
							Object obj2=operandStack.pop();
							Object obj1=operandStack.pop();
							Graph graph2=new Graph();                                                        
							graph2.Concat(obj1, obj2);      //obj1 ile obj2'nin yeri çok önemli.
							operandStack.push(graph2);
							break;
						case '|':
							Object obj4=operandStack.pop();
							Object obj3=operandStack.pop();
							Graph graph3=new Graph();
							graph3.Union(obj3, obj4);   //obj3 ile obj4'ün yeri çok önemli.
							operandStack.push(graph3);
							break;
						default:
							break;
						}
						break;
					case 0:
						operatorStack.pop();
						i++;
						break;
					case -1:    //Matrisin kesişen ifadesi -1 ise 
						operatorStack.push(alfabe[i]);      //Bunu operatorStack kısmına  ekle. 
						i++;
						break;
					default:
						break;
					}
				}
			}
			return (Graph) operandStack.pop();
		}
	}


///////////////////////////////////////////////////////////////////////////////////
    public void reset(){
	Node.reset();
	operandStack.clear();
	operatorStack.clear();
	}
 
//////////////////////////////////////////////////////////////////////////////////

    public void parcala(String girdi) { //PARSE İŞLEMİ
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
 
    
