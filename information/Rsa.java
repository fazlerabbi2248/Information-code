
package information;


import java.math.BigDecimal;
import java.math.BigInteger;



public class Rsa {
    
    
  
    
   static double gcd(double a,double b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    
    public static void main(String[] args) {
        
     double p=167;
     
     double q=11;
     
     double n=p*q;
     
     double QN=(p-1)*(q-1);
     //BigInteger qn = BigDecimal.valueOf(QN).toBigInteger();
     double E=4;
    // BigInteger e = BigDecimal.valueOf(E).toBigInteger();
    // int  comparevalue=e.compareTo(qn);
     while(E<QN)
     {
         if(gcd(QN,E)==1)
         {
             break;
         }
         else
         {
              E++;
              //E=E.add(BigInteger.ONE);
         }
     }
        System.out.println("e=");
        System.out.println(E);
        
       // double e1= e.doubleValue();
        
        double d;
        while(true)
        {
           // d=(1+QN)/E;
            break;
        }
        d=(1+QN)/E;
        System.out.println("d=");
        System.out.println(+d);
        
        int msg=88;
        System.out.println("Plain text:");
        System.out.println(msg);
        double c = (Math.pow(msg,E))%n;
        System.out.println("Encrypted message is : ");
        System.out.println(c);
  
        BigInteger N = BigDecimal.valueOf(n).toBigInteger();
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        BigInteger D = BigDecimal.valueOf(d).toBigInteger();
        BigInteger Dmsg = (C.modPow(D, N));
        System.out.println("Derypted message is : ");
        System.out.println(Dmsg);
        
       
        
    }
    
}

