/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081006.p270424;

/**
 *
 * @author hafiz
 */
public class Square {
    private int sisi;

    public Square(){
    }  
    
    public int getSisi(){
        return sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public String getName(){
        return "Square";
    }
    public float getArea(){
        return sisi*sisi;
    }
    
    public static void main(String[] args){
        
    }
    
}
