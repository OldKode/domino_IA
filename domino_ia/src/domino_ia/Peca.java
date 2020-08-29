/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino_ia;
import java.util.Random;

/**
 *
 * @author jlsl4
 */
public class Peca {
    int ladoA;
    int ladoB;
    
    public Peca(){
        Random gerador = new Random();
        
        ladoA = gerador.nextInt(5) +1;
        ladoB = gerador.nextInt(5) + 1;
    }
    
    public Peca(int ladoAPamam, int ladoBPamam){
        Random gerador = new Random();
        
        this.ladoA = ladoAPamam;
        this.ladoB = ladoBPamam;
    }
    
    public void mostraPeca(){
        
        System.out.println(String.valueOf(this.ladoA) + " / " + String.valueOf(this.ladoB));
    };
            
}
