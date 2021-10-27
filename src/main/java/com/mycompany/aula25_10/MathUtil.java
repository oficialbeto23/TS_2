
package com.mycompany.aula25_10;

/**
 *
 * @author CHFS
 */
public class MathUtil {
    public static int mdc(int a, int b){
        
        if(b > 0 && a % b == 0){
            return b;
        }
            
        return -1;
    }
    
}
