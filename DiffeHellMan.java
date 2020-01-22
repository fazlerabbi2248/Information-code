
package information;

import static java.lang.Math.pow;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class DiffeHellMan {
    
     public static Set<Integer> primefactor(int pf)
    {
        
       Set<Integer> primefactors = new HashSet<>();
       int copyOfInput = pf;
       
     for (int i = 2;copyOfInput>= i; i++) 
     { 
         if (copyOfInput % i == 0)
         { 
             primefactors.add(i);
            copyOfInput =copyOfInput/ i;
         }
         
       } 



        return primefactors;

        
    }
    
    public static boolean checkPRoot(int p,int q){
        
        int pf=p-1;
       
        Set<Integer> primefactors = new HashSet<>();
        
        
        primefactors = primefactor(pf);
        
        
        
        Object[] arr = primefactors.toArray();
        int len =arr.length;
        int flag=1;
        for(int i=0;i<len;i++)
        {
            System.out.println("arr[i]");
            System.out.println(arr[i]);
            int a = (int) arr[i];
            int d;
            d=(int) pf/(int)a;
            int k =(int)pow(q,d)%p;
            System.out.println("k is");
            System.out.println(+k);
            if(k==1)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
            
            
           
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int p,g,a,b;
        System.out.println("Enter P:");
        p =sc.nextInt();
        System.out.println("Enter the primitive root:");
        g= sc.nextInt();
        //System.out.println(primefactor(p-1));
        if(checkPRoot(p,g)==true)
        {
            System.out.println("Enter Alice private key:");
            a=sc.nextInt();
            System.out.println("Enter BOB private key:");
            b=sc.nextInt();
        
            int x,y;
           //key generated
        
           x=(int)pow(g,a)%p;
           y=(int)pow(g,b)%p;
        
           //exchange of generaTED keys takes place
           //alice recived y and bob recived x
        
           //now generated screate key
        
        
           int ka,kb;
        
           ka=(int)pow(y,a)%p;
           kb=(int)pow(x,b)%p;
        
           System.out.println("ka="+ka);
           System.out.println("kb="+kb);
        }
        else
        {
            System.out.printf("%d is not Primitve root",g);
        }
        
        
        
        
    }
    
}
