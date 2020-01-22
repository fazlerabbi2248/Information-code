
package information;

import java.util.Scanner;


public class HillCipher {
    
   final static char alphabet[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   final static int value[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
    
   public static void createkeyMatrrix(String key,int keyMatrix[][])
   {
       int m=0;
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               
               for(int k=0;k<26;k++)
               {
                   
                   if(alphabet[k]==key.charAt(m))
                   {
                       keyMatrix[i][j] = value[k];
                       break;
                       
                   }
               }
               m++;
           }
       }
       
   }
   
   public static void createplainTextMatrix(String plaintext,int plainMatrix[][])
   {
       int m=0;
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<1;j++)
           {
               
               for(int k=0;k<26;k++)
               {
                   
                   if(alphabet[k]==plaintext.charAt(m))
                   {
                       plainMatrix[i][j] = value[k];
                       break;
                       
                   }
               }
               m++;
           }
       }
       System.out.println("Message Matrix:");
       for(int j=0;j<3;j++)
          {
              System.out.print(" "+plainMatrix[+j][0]);
              System.out.println("");
          }
          System.out.println("");
   }
   
   public static void encrypt(int key[][],int p[][])
   {
       
       
   }
   
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        String key;
        int keyM[][] = new int[3][3];
        
        System.out.println("Enter the key:");
        key =sc.nextLine();
        System.out.println("Enter the plainText:");
        
        String plain;
        plain=sc.nextLine();
        int plainM[][] = new int[3][1];
        
        
        createkeyMatrrix(key,keyM);
        createplainTextMatrix(plain,plainM);
        
    }
        
    
}
