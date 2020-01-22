
package information;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Rsa1 {
    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    
    public static void main(String[] args) {
        
     int p=17;
     int q=11;
     
     int n=p*q;
     
     int qn=(p-1)*(q-1);
     int e=4;
     while(e<qn)
     {
         if(gcd(qn,e)==1)
         {
             break;
         }
         else
         {
             e++;
         }
     }
        System.out.println("e=");
        System.out.println(+e);
        
        int d;
        d=(1+qn)/e;
        System.out.println("d=");
        System.out.println(+d);
        
        int msg=88;
       double c = (Math.pow(msg,e))%n;
 System.out.println("Encrypted message is : -");
 System.out.println(c);
                //converting int value of n to BigInteger
 BigInteger N = BigInteger.valueOf(n);
 //converting float value of c to BigInteger
 BigInteger C = BigDecimal.valueOf(c).toBigInteger();
       BigInteger msgback = (C.pow(d)).mod(N);
 System.out.println("Derypted message is : -");
 System.out.println(msgback);
        
    }
}
