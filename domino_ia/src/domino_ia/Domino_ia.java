/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino_ia;

/**
 *
 * @author jlsl4
 */
public class Domino_ia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criando peças
        Peca[] lista_pecas = new Peca[36];
        int cont = 0;
        
        for(int i = 1; i <= 6 ; i++){
            for(int n = 1; n <= 6 ; n++){
               lista_pecas[cont] = new Peca(i,n);
               cont++;
            }
        }
        
        for(int i = 0; i < 36 ; i++){
           lista_pecas[i].mostraPeca();
        }
    }
    
}
