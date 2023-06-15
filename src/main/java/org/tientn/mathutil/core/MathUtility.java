
package org.tientn.mathutil.core;

/**
 *
 * @author ACER
 */
public class MathUtility {
     public static long getFactiorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
       
        
        if (n < 0 || n > 20){
            throw  new IllegalArgumentException("invalid n. n must be between 0..20. nhập đúng đi con chó");
        }
        return product;
    } 
}
