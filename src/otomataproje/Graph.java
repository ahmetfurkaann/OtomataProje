/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomataproje;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MONSTER
 */
public class Graph {
    
    public List<Kenar> kenarlar;
    public Node start;
    public Node end;
    public String dot_kod;
    
    Regex regex2 = new Regex();
    
    public void setDot_kod(String dot_kod) {
        this.dot_kod = "digraph \"\" {\n"
                + "start [shape= point]\n"
                + "start ->" + getStart() + "\n"
                + getEnd() + " [shape= doublecircle]\n" +
                regex2.transformNFA() + "\n}";
    }
    
    public Graph(){
        kenarlar = new ArrayList<Kenar>();      //Kenarlar bu listede tutulacak.
    }

    public List<Kenar> getKenarlar() {
        return kenarlar;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }
    
    public void reset(){
        Node.reset();               // id = 0 işlemini yapıyor.
    }
//      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    
       
//      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    
    
    public void Star(Object obj){   //Burada girilen ifadenin karakter mi yoksa Graph mı olduğunu kontrol etmeliyiz.
        if(obj.getClass().getName().equals(Graph.class.getName())){
            addStar((Graph)obj);
        }
    }

//      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public void Union(Object obj1, Object obj2){    
	if (obj1.getClass().getName().equals(Graph.class.getName())) {          
            if (obj2.getClass().getName().equals(Graph.class.getName())) {
		addUnion((Graph) obj1, (Graph) obj2);
                    return;
		}
	}
    }
    
//      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    
    
    public void Concat(Object obj1, Object obj2){
        
	if (obj1.getClass().getName().equals(Graph.class.getName())) {
            if (obj2.getClass().getName().equals(Graph.class.getName())) {
		addConcat((Graph) obj1, (Graph) obj2);
                    return;
		}
            }
        }   

//      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


    
    public static boolean KarakterveyaSayiMi(char c){       //Girilen ifadenin sayı veya alfabi mi yoksa sembol mü olduğunu kontrol ediyoruz.
        if(Character.isLetterOrDigit(c)){
            return true;
        }
        else{
            return false;       //Karakter veya sayı değilse sembol olur.
        }
    }  
    /////////////////////////////////////////////////////////////////////////
    
    public void alfabeNFA(char c){             
        Node begNode = new Node();
        Node endNode = new Node();
        Kenar kenar = new Kenar(begNode, endNode, Character.toString(c));
        this.kenarlar.add(kenar); 
        this.start= begNode;
        this.end=endNode;
    }
    
    /////////////////////////////////////////////////////////////////////////
    
    public void addStar(Graph graph){       //DÜZELTİLDİ
        Node begNode = new Node();
        Node endNode = new Node();
        Kenar kenar1 = new Kenar(begNode, endNode, "ε");
        Kenar kenar2 = new Kenar(begNode, graph.getStart(), "ε");
        Kenar kenar3 = new Kenar(graph.getEnd(), endNode, "ε");
        Kenar kenar4 = new Kenar(graph.getEnd(), graph.getStart(), "ε");
        for(int i = 0; i<graph.getKenarlar().size(); i++){
            this.kenarlar.add(graph.getKenarlar().get(i));
        }
        this.kenarlar.add(kenar1);
        this.kenarlar.add(kenar2);
        this.kenarlar.add(kenar3);
        this.kenarlar.add(kenar4);
        this.start = begNode;
        this.end = endNode;
    }
    
   
    /////////////////////////////////////////////////////////////////////////


    
    public void addUnion(Graph graph1, Graph graph2){   //BU DOĞRU
        Node begNode = new Node();
        Node endNode = new Node();   
        Kenar kenar1 = new Kenar(begNode, graph1.getStart(), "ε");
        Kenar kenar2 = new Kenar(begNode, graph2.getStart(), "ε");
        Kenar kenar3 = new Kenar(graph1.getEnd(), endNode, "ε");
        Kenar kenar4 = new Kenar(graph2.getEnd(), endNode, "ε");
        this.start = begNode;
        this.end = endNode;
        for(int i=0; i<graph1.getKenarlar().size(); i++){
            this.kenarlar.add(graph1.getKenarlar().get(i));
        }
        for(int i=0; i<graph2.getKenarlar().size(); i++){
            this.kenarlar.add(graph2.getKenarlar().get(i));
        }        
        this.kenarlar.add(kenar1);
        this.kenarlar.add(kenar2);
        this.kenarlar.add(kenar3);
        this.kenarlar.add(kenar4);
    }        
    

////////////////////////////////////////////////////////////////////////////////////
 
    public void addConcat(Graph graph1, Graph graph2) {     //BU DOĞRU
        //Node epbegnode = new Node();
        //Node ependnode = new Node();
       // Node midNode = new Node();
	Kenar kenar1 = new Kenar(graph1.getEnd(), graph2.getStart(), "ε"); 
        // kenar2 = new Kenar(midNode, graph2.getStart(), "ε");
	this.start = graph1.getStart();
	this.end = graph2.getEnd();
	for (int i = 0; i < graph1.getKenarlar().size(); i++) {
		this.kenarlar.add(graph1.getKenarlar().get(i));
	}
	for (int i = 0; i < graph2.getKenarlar().size(); i++) {
		this.kenarlar.add(graph2.getKenarlar().get(i));
	}
	this.kenarlar.add(kenar1);
        //this.kenarlar.add(kenar2);
	}
 
/////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        /*String yazdir = "\nBaşlangıç: " + "s" +this.start + " Son: " + "s" + this.end + "\n";
        for(int i = 0; i < kenarlar.size();i++){
            yazdir += kenarlar.get(i) + "\n";
        }
        return yazdir;*/
        
        String yazdir = "digraph \"graph\" {\nstart [shape=point]" + "\nstart " + "-> s" +this.start + "\n" + "s" + this.end + "[shape= doublecircle]\n";
        for(int i = 0; i < kenarlar.size();i++){
            yazdir += kenarlar.get(i) + "\n";
        }
        yazdir += "}";
        return yazdir;
    }

/////////////////////////////////////////////////////////////////////////////////////
    
}
