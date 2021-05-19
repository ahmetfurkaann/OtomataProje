/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomataproje;

/**
 *
 * @author MONSTER
 */
public class Node {
    
    private int id;
    private static int ID=0;
    
    public Node(){
    	this.id = ID++;
    }
 
    public int getId() {
		return id;
    }
	
    public static void reset(){
		ID=0;
    }
 
    @Override	
    public String toString() {      
		return id+"";
	}

    
}
