/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;
/**
 *
 * @author reroes
 */
public class Ejemplo {
                      // jonathan coronel
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int par1 = 100;
        int par2 = 110;
       
        Recorrer(par1,par2);
        
    
    }
    public static void Recorrer (int par1, int par2){
           int[] a = new int[10];
           for (int i = 0; i < a.length; i++) {
              a[i] = RandomUtils.nextInt(par1, par2);
              System.out.println(a[i]);
        }
           
    }
            
}
