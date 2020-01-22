
package information;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Masum Billah
 */
public class CaesarCypher {
    
   public static final char realalphabet[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    public static String encrypt(String plain,int shift)
    {
        plain = plain.toLowerCase();
        String ciphertext="";
        int replacevalue;
        
        for(int i=0;i<plain.length();i++){
            
          for(int j=0;j<26;j++)
          {
              if(realalphabet[j]==plain.charAt(i))
              {
                  replacevalue=abs((shift+j)%26);
                  
                  ciphertext=ciphertext+realalphabet[replacevalue];
                  break;
                  
                  
              }
          }
        }
        System.out.println(ciphertext);
        return ciphertext;
        
    }
    public static void decrypt(String ciper,int shift)
    {
        ciper = ciper.toLowerCase();
        String detext="";
        int replacevalue;
        
        for(int i=0;i<ciper.length();i++){
            
          for(int j=0;j<26;j++)
          {
              if(realalphabet[j]==ciper.charAt(i))
              {
                  replacevalue=abs((j-shift)%26);
                  detext=detext+realalphabet[replacevalue];
                  break;
                  
                  
              }
          }
        }
        System.out.println(detext);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plaintext;
        System.out.println("Enter the Plain text:");
        plaintext=sc.nextLine();
        System.out.println("Enter the shit to right");
        int shift;
        shift =sc.nextInt();
        String ciphertext= encrypt(plaintext,shift);
        decrypt(ciphertext,shift);
        
        
        
        
    }
}
