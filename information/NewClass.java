/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Masum Billah
 */
public class NewClass {
    
     public static Set<Integer> primefactor(int pf)
    {
        
       Set<Integer> primefactors = new HashSet<>();
       int copyOfInput = pf;
       
     for (int i = 2;copyOfInput>= i; i++) 
     { 
         if (copyOfInput % i == 0)
         { 
             primefactors.add(i);
            copyOfInput /= i;
         }
         
       } 



        return primefactors;

        
    }
    
}
