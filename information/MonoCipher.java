
package information;

import java.util.Scanner;


public class MonoCipher {
    
    public static void main(String[] args) throws StringIndexOutOfBoundsException {
        
        final char realalphabet[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        final char subalphabet[]={'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        
        String plaintext;
        char ciphertext[]=new char[100];
	 char decryptiontext[]=new char[100];
	 int i,l;
	
         Scanner s=new Scanner(System.in);
	 System.out.println(" Plain text:");
	 plaintext=s.nextLine();
	 plaintext=plaintext.toLowerCase();
         System.out.println(plaintext);
         l=(plaintext.length());
         
         for(i=0;i<l;i++)
         {
             for(int j=0;j<26;j++)
             {
                 if(realalphabet[j]==plaintext.charAt(i))
                 {
                     ciphertext[i]=subalphabet[j];
                     break;
                 }
             }
         }
         
         System.out.println("The Cipher text is:");
         
         System.out.println(ciphertext);
         
         
         String c= new String(ciphertext);
         for(i=0;i<l;i++)
         {
             for(int j=0;j<26;j++)
             {
                 if(subalphabet[j]==c.charAt(i))
                 {
                     decryptiontext[i]=realalphabet[j];
                     break;
                 }
             }
         }
         
         System.out.println("The Decryption text is:");
         
         System.out.println(decryptiontext);
         
         
        
    }
    
}
